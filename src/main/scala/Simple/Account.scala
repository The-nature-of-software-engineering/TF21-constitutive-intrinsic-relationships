package dev.accelerated.DTF
package Simple

case class Account(
                    id: String,
                    balance: Double
                  ) {
  def decreaseWith(amount: Double): Account = copy(balance = balance - amount)
  def increaseWith(amount: Double): Account = copy(balance = balance + amount)

  def pays(to: Account): PaymentDirection = PaymentDirection(this, to)
}
