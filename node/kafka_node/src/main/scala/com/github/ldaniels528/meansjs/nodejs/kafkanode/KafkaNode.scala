package com.github.ldaniels528.meansjs.nodejs.kafkanode

import com.github.ldaniels528.meansjs.nodejs.NodeModule
import com.github.ldaniels528.meansjs.nodejs.events.EventEmitter

import scala.scalajs.js

/**
  * Kafka-Node Node.js module
  * @author lawrence.daniels@gmail.com
  * @see https://www.npmjs.com/package/node-kafka
  * @version 0.0.11
  */
@js.native
trait KafkaNode extends NodeModule with EventEmitter {

  def Client: ClientClass = js.native

  def Consumer: ConsumerClass = js.native

  def HighLevelConsumer: HighLevelConsumerClass = js.native

  def HighLevelProducer: HighLevelProducerClass = js.native

  def KeyedMessage: KeyedMessageClass = js.native

  def Offset: OffsetClass = js.native

  def Producer: ProducerClass = js.native

}
