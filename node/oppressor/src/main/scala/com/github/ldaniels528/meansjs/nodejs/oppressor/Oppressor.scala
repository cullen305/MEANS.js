package com.github.ldaniels528.meansjs.nodejs.oppressor

import com.github.ldaniels528.meansjs.nodejs.NodeModule
import com.github.ldaniels528.meansjs.nodejs.stream.{Duplex, Readable}

import scala.scalajs.js

/**
  * Oppressor - streaming http compression response negotiator
  * @author lawrence.daniels@gmail.com
  * @see [[https://github.com/substack/oppressor]]
  * @version 0.0.1
  */
@js.native
trait Oppressor extends NodeModule {

  /**
    * Return a duplex stream that will be compressed with gzip, deflate, or no compression depending on the
    * accept-encoding headers sent.
    *
    * oppressor will emulate calls to http.ServerResponse methods like writeHead() so that modules like filed that
    * expect to be piped directly to the response object will work.
    */
  def apply(readable: Readable): Duplex = js.native

}
