package de.hpi.epic.pricewars.logging.marketplace

import de.hpi.epic.pricewars.types._

/**
  * Created by Jan on 06.12.2016.
  */
case class UpdateOfferEntry(offer_id: ID, uid: ID, product_id: ID, quality: Quality, merchant_id: ID, amount: Amount,
  price: Currency, shipping_time_standard: ShippingTime, shipping_time_prime: Option[ShippingTime], prime: PrimeOffer,
  signature: Signature, http_code: HttpCode, timestamp: Timestamp)
