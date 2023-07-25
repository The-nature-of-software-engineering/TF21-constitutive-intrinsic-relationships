package dev.accelerated.DTF
package Advanced

import Advanced.TransactionRole.{CreditorRole, DebtorRole}
import Advanced.{PaymentAccountRoles, TransactionRole}
import Advanced.PaymentAccounts

import dev.accelerated.DTF.Advanced.PaymentAccountRoles.{CreditingAccountRole, DebitingAccountRole}

case class Account(
                    id: String,
                    balance: Double
                  ) {

  def actingAsADebitingAccount(): DebitingAccountRole = DebitingAccountRole(this)
  def actingAsACreditingAccount(): CreditingAccountRole = CreditingAccountRole(this)
}


