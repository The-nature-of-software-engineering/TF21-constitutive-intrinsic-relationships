package dev.accelerated.DTF
package Simple

case class PaymentDirection(
                           from: Account,
                           to: Account
                           ) {
  def theAmountOf(amount: Double): Either[String, PaymentResult] = amount match {
    case _ if amount < 0 => Left("Negative transfers are not allowed")
    case _ => Right(
      PaymentResult(
        from = from.decreaseWith(amount),
        to = to.increaseWith(amount)
      )
    )
  }
}
