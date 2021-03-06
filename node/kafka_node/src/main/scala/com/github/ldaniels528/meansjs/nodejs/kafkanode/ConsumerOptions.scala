package com.github.ldaniels528.meansjs.nodejs.kafkanode

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Consumer Options
  * @author lawrence.daniels@gmail.com
  */
@ScalaJSDefined
class ConsumerOptions extends js.Object {
  /** consumer group id, deafult `kafka-node-group` */
  var groupId: js.UndefOr[String] = _

  /** Auto commit config */
  var autoCommit: js.UndefOr[Boolean] = _

  /** The max wait time is the maximum amount of time in milliseconds to block waiting if insufficient data is available at the time the request is issued, default 100ms */
  var autoCommitIntervalMs: js.UndefOr[Int] = _

  /** This is the minimum number of bytes of messages that must be available to give a response, default 1 byte */
  var fetchMaxWaitMs: js.UndefOr[Int] = _

  /** The maximum bytes to include in the message set for this partition. This helps bound the size of the response. */
  var fetchMinBytes: js.UndefOr[Int] = _

  /** If set true, consumer will fetch message from the given offset in the payloads */
  var fetchMaxBytes: js.UndefOr[Int] = _

  var fromOffset: js.UndefOr[Boolean] = _

  /** If set to 'buffer', values will be returned as raw buffer objects. */
  var encoding: js.UndefOr[String] = _

}

/**
  * Consumer Options Companion
  * @author lawrence.daniels@gmail.com
  */
object ConsumerOptions {

  def apply(groupId: js.UndefOr[String] = js.undefined,
            autoCommit: js.UndefOr[Boolean] = js.undefined,
            autoCommitIntervalMs: js.UndefOr[Int] = js.undefined,
            fetchMaxWaitMs: js.UndefOr[Int] = js.undefined,
            fetchMinBytes: js.UndefOr[Int] = js.undefined,
            fetchMaxBytes: js.UndefOr[Int] = js.undefined,
            fromOffset: js.UndefOr[Boolean] = js.undefined,
            encoding: js.UndefOr[String] = js.undefined) = {
    val options = new ConsumerOptions()
    options.groupId = groupId
    options.autoCommit = autoCommit
    options.autoCommitIntervalMs = autoCommitIntervalMs
    options.fetchMaxWaitMs = fetchMaxWaitMs
    options.fetchMinBytes = fetchMinBytes
    options.fetchMaxBytes = fetchMaxBytes
    options.fromOffset = fromOffset
    options.encoding = encoding
    options
  }
}