package io.surfkit.clientlib.wysihtml5

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Created by suroot on 17/05/16.
  */
@JSName("wysihtml.dom")
@js.native
object dom extends js.Object{

  def getAsDom(html: String, context: org.scalajs.dom.raw.Document): org.scalajs.dom.raw.Element = js.native
}
