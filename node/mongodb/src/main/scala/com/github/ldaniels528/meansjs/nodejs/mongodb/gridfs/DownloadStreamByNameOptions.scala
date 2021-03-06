package com.github.ldaniels528.meansjs.nodejs.mongodb.gridfs

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * GridFS Bucket Download Stream (By Name) Options
  * @author lawrence.daniels@gmail.com
  */
@ScalaJSDefined
class DownloadStreamByNameOptions extends js.Object {
  /** The revision number relative to the oldest file with the given filename. 0 gets you the oldest file,
    * 1 gets you the 2nd oldest, -1 gets you the newest. */
  var revision: js.UndefOr[Int] = _

  /** Optional 0-based offset in bytes to start streaming from */
  var start: js.UndefOr[Int] = _

  /** Optional 0-based offset in bytes to stop streaming before */
  var end: js.UndefOr[Int] = _

}

/**
  * GridFS Bucket Download Stream Options Companion
  * @author lawrence.daniels@gmail.com
  */
object DownloadStreamByNameOptions {

  def apply(revision: js.UndefOr[Int] = js.undefined,
            start: js.UndefOr[Int] = js.undefined,
            end: js.UndefOr[Int] = js.undefined) = {
    val options = new DownloadStreamByNameOptions()
    options.revision = revision
    options.start = start
    options.end = end
    options
  }

}