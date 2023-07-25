package dev.accelerated.DTF
package Advanced

import Advanced.PaymentAccountRoles.{DebitingAccountRole, CreditingAccountRole}

case class PaymentAccounts(
                            creditorAccount: CreditingAccountRole,
                            debtorAccount: DebitingAccountRole
                           ) {
  def theAmountOf(amount: Double): Either[String, PaymentResult] = amount match {
    case _ if amount < 0 => Left("Negative transfers are not allowed")
    case _ => Right(
      PaymentResult(
        debtorAccount.decreaseWith(amount),
        creditorAccount.increaseWith(amount)
      )
    )
  }
}