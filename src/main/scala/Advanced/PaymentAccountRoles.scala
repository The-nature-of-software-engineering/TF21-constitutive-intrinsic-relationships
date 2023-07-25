package dev.accelerated.DTF
package Advanced

import Advanced.PaymentAccountRoles.{CreditingAccountRole, DebitingAccountRole}


enum PaymentAccountRoles:

  case CreditingAccountRole(account: Account)
  case DebitingAccountRole(account: Account)


extension(creditingAccount: CreditingAccountRole)

  def balance: Double = creditingAccount.account.balance

  def increaseWith(amount: Double): CreditingAccountRole = CreditingAccountRole(
      creditingAccount.account.copy(
        balance = creditingAccount.account.balance + amount
      )
    )

extension(debitingAccount: DebitingAccountRole)

  def balance: Double = debitingAccount.account.balance

  def pays(creditingAccount: CreditingAccountRole): PaymentAccounts = PaymentAccounts(
    creditorAccount = creditingAccount,
    debtorAccount = debitingAccount
    )

  def decreaseWith(amount: Double): DebitingAccountRole = DebitingAccountRole(
      debitingAccount.account.copy(
        balance = debitingAccount.account.balance - amount
      )
    )
