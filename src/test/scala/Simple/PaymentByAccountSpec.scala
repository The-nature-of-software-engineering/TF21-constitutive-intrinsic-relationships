//package dev.accelerated.DTF
//package Simple
//
//class PaymentByAccountSpec extends org.specs2.mutable.Specification {
//  override def is = s2"""
//
//  An accountA1 with 10 dollars that transfers 5 dollars to accountB1 with 0 dollars
//    should produce an accountA2 with 5 dollars $accountA2Has5Dollars
//    should produce an accountB2 with 5 dollars $accountB2Has5Dollars
//
//  An accountA1 with 10 dollars that transfers -2 dollars to accountB1 with 0 dollars
//    should produce some error $negativeTransfersNotAllowed
//
//  """
//
//  def accountA1 = Account("A1", 10.0)
//  def accountB1 = Account("B1", 0.0)
//  def accountA2 = accountA1.pays(accountB1).theAmountOf(5.0).map(_.from)
//  def accountB2 = accountA1.pays(accountB1).theAmountOf(5.0).map(_.to)
//
//  def accountA2Has5Dollars = accountA2.map(_.balance) must beRight(5.0)
//  def accountB2Has5Dollars = accountA2.map(_.balance) must beRight(5.0)
//
//  def negativeTransferError = accountA1.pays(accountB1).theAmountOf(-2.0)
//  def negativeTransfersNotAllowed = negativeTransferError must beLeft("Negative transfers are not allowed")
//
//}
//
