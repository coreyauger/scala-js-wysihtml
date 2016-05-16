package io.surfkit.clientlib.wysihtml5

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Created by coreyauger on 15/05/16.
  */
//https://github.com/Voog/wysihtml/blob/master/src/commands.js
@JSName("wysihtml.Commands")
@js.native
class Commands extends js.Object{
  def support(command: String):Boolean = js.native
  def exec(command: String, value:  js.Any*): js.Any = js.native
  def remove(command: String, value: js.Any*): js.Any = js.native
  def state(command: String, value: js.Any*): js.Any = js.native
  def stateValue(value: js.Any): js.Any = js.native
}

