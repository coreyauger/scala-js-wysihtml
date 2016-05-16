package io.surfkit.clientlib.wysihtml5

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Created by suroot on 15/05/16.
  */
@js.native
trait Pos extends js.Object{
  var x: Double = js.native
  var y: Double = js.native
}
object Pos{
  def apply(x: Double = 0.0, y:Double = 0.0):Pos = {
    val result = js.Dynamic.literal()
    result.x = x
    result.y = y
    result.asInstanceOf[Pos]
  }
}

@js.native
trait Img extends js.Object{
  var src: js.UndefOr[String] = js.native
  var alt: js.UndefOr[String] = js.native
}
object Img{
  def apply(
         src: js.UndefOr[String] = js.undefined,
         alt: js.UndefOr[String] = js.undefined): Img = {
    val result = js.Dynamic.literal()
    src.foreach(result.src = _)
    alt.foreach(result.alt = _)
    result.asInstanceOf[Img]
  }
}

@js.native
trait CreateTable extends js.Object{
  var rows: js.UndefOr[Double] = js.native
  var cols: js.UndefOr[Double] = js.native
}
object CreateTable{
  def apply(
         rows: js.UndefOr[Double] = js.undefined,
         cols: js.UndefOr[Double] = js.undefined): CreateTable = {
    val result = js.Dynamic.literal()
    rows.foreach(result.rows = _)
    cols.foreach(result.cols = _)
    result.asInstanceOf[CreateTable]
  }
}

@js.native
trait Link extends js.Object{
  var href: js.UndefOr[String] = js.native
  var target: js.UndefOr[String] = js.native
  var rel: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}
object Link{
  def apply(
         href: js.UndefOr[String] = js.undefined,
         target: js.UndefOr[String] = js.undefined,
         rel: js.UndefOr[String] = js.undefined,
         text: js.UndefOr[String] = js.undefined): Link = {
    val result = js.Dynamic.literal()
    href.foreach(result.href = _)
    target.foreach(result.target = _)
    rel.foreach(result.rel = _)
    text.foreach(result.text = _)
    result.asInstanceOf[Link]
  }
}


@js.native
trait Format extends js.Object{
  var tagName: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var classRegex: js.UndefOr[String] = js.native
}
object Format{
  def apply(
         tagName: js.UndefOr[String] = js.undefined,
         className: js.UndefOr[String] = js.undefined,
         classRegex: js.UndefOr[String] = js.undefined): Format = {
    val result = js.Dynamic.literal()
    tagName.foreach(result.tagName = _)
    className.foreach(result.className = _)
    classRegex.foreach(result.classRegex = _)
    result.asInstanceOf[Format]
  }
}

case class TableElement(name: String)
object TableElement{
  val row = TableElement("row")
  val col = TableElement("col")
}

case class InsertTableCells(name: String)
object InsertTableCells{
  val above = TableElement("above")
  val below = TableElement("below")
  val before = TableElement("before")
  val after = TableElement("after")
}

//https://github.com/Voog/wysihtml/blob/master/src/views/view.js
@JSName("wysihtml.views.View")
@js.native
class View(editor: Editor, editableElement: org.scalajs.dom.Element, options: EditorOptions) extends js.Object{
  def focus():Unit = js.native
  def hide():Unit = js.native
  def show():Unit = js.native
  def disable():Unit = js.native
  def enable():Unit = js.native
}

//https://github.com/Voog/wysihtml/blob/master/src/views/composer.js
@JSName("wysihtml.views.Composer")
@js.native
class Composer(editor: Editor, editableElement: org.scalajs.dom.Element, options: EditorOptions) extends View(editor, editableElement, options){

  var commands: Commands = js.native

  def clear(): Unit = js.native
  def setValue(html: String, parse: Boolean = true):Unit = js.native
  def getValue(parse: Boolean = true, clearInternals: Boolean = true): String = js.native
  def cleanUp(rules:ParseRules):Unit = js.native
  def getScrollPos():Pos = js.native
  def setScrollPos(p:Pos): Unit = js.native
  def getTextContent():String = js.native
  def hasPlaceholderSet():Boolean = js.native
  def isEmpty():Boolean = js.native
}
