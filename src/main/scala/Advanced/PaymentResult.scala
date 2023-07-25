package dev.accelerated.DTF
package Advanced

import Advanced.PaymentAccountRoles.{CreditingAccountRole, DebitingAccountRole}

case class PaymentResult(
                          debitingAccountRole: DebitingAccountRole,
                          creditingAccountRole: CreditingAccountRole
                        )