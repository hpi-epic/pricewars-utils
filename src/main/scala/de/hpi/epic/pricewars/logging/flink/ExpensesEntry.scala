package de.hpi.epic.pricewars.logging.flink

import de.hpi.epic.pricewars.logging.base._
import de.hpi.epic.pricewars.types._

/**
  * Created by Jan on 31.01.2017.
  */
case class ExpensesEntry(merchant_id: Token, expenses: Currency, timestamp: Timestamp) extends MerchantIDEntry
  with TimestampEntry with ValueEntry[Currency] {
  override def value: Currency = expenses
}

object ExpensesEntry {
  type EntryT =  MerchantIDEntry with AmountEntry with PriceEntry with TimestampEntry
  implicit def toExpensesEntry(entry: EntryT): ExpensesEntry =
    new ExpensesEntry(
      entry.merchant_id,
      entry.price * entry.amount * -1,
      entry.timestamp
    )
}
