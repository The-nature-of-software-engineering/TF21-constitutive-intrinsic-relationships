package dev.accelerated.DTF
package Simple

import io.cucumber.scala.{EN, ScalaDsl}
import org.junit.Assert.assertEquals

import scala.collection.mutable

class StepDefinitions extends ScalaDsl with EN {

  var accounts: mutable.Map[String, Account] = mutable.Map[String, Account]()

  Given("""{word}'s balance is {double} dollars""") { (name: String, amount: Double) =>
    accounts(name) = Account(name, amount)
  }

  When("""{word} pays {word} {double} dollars""") { (debtor: String, creditor: String, amount: Double) =>

    val debtorAccount: Account = accounts.find(_._1 == debtor).getOrElse((debtor, Account(debtor, 0)))._2
    val creditorAccount: Account = accounts.find(_._1 == creditor).getOrElse((creditor, Account(creditor, 0)))._2

    val result: Either[String, PaymentResult] =
      debtorAccount pays creditorAccount theAmountOf amount

    accounts(debtor) = result.map(_.from).getOrElse(Account("unknown", 0.0))
    accounts(creditor) = result.map(_.to).getOrElse(Account("unknown", 0.0))
  }

  Then("""{word}'s updated balance is {double} dollars""") { (name: String, amount: Double) =>
    assertEquals(accounts(name).balance, amount, 0.00001)
  }
}
