package com.github.ldaniels528.meansjs.nodejs.datastax.datatypes

import com.github.ldaniels528.meansjs.nodejs.buffer.Buffer
import com.github.ldaniels528.meansjs.nodejs.datastax.datatypes.UuidClass.CxUuid
import com.github.ldaniels528.meansjs.util.ScalaJsHelper._

import scala.scalajs.js

/**
  * Cassandra UUID class
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait UuidClass extends js.Object {

  def fromString(value: String): CxUuid = js.native

  def random(): CxUuid = js.native

}

/**
  * Cassandra UUID Class Companion
  * @author lawrence.daniels@gmail.com
  */
object UuidClass {

  /**
    * Cassandra UUID instance
    */
  @js.native
  trait CxUuid extends js.Any

  /**
    * Cassandra UUID Class Extensions
    * @author lawrence.daniels@gmail.com
    */
  implicit class CassandraUuidClassExtensions(val `class`: UuidClass) extends AnyVal {

    @inline
    def apply(buffer: Buffer) = `class`.New[CxUuid](buffer)

  }

}