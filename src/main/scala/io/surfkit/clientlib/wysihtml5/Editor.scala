package io.surfkit.clientlib.wysihtml5

import org.scalajs.dom
import org.scalajs.dom.ext.Color
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Created by corey auger
 */

@JSName("wysihtml.Editor")
@js.native
class Editor(domId: String, options: EditorOptions) extends js.Object{

  var editableElement: org.scalajs.dom.Element = js.native
  var composer: Composer = js.native
  var currentView: View = js.native

  //https://github.com/Voog/wysihtml/wiki/Functions-and-properties
  def setValue(html: String, parse: Boolean = true):Unit = js.native
  def getValue(parse: Boolean = true): String = js.native
  def isCompatible():Boolean = js.native
  def hasPlaceholderSet():Boolean = js.native
  def focus():Unit = js.native
  def enable():Unit = js.native
  def disable():Unit = js.native
  def config():EditorOptions = js.native
  def cleanUp(rules:ParseRules):Unit = js.native

  def on(event: String, f: js.Function): Unit = js.native
}

class WysihtmlEditor(domId: String, options: EditorOptions) {

  private[this] val editor = new Editor(domId, options)

  //https://github.com/Voog/wysihtml/wiki/Functions-and-properties
  def setValue(html: String, parse: Boolean = true):Unit = editor.setValue(html, parse)
  def getValue(parse: Boolean = true): String = editor.getValue(parse)
  def isCompatible():Boolean = editor.isCompatible()
  def hasPlaceholderSet():Boolean = editor.hasPlaceholderSet()
  def focus():Unit = editor.focus()
  def enable():Unit = editor.enable()
  def disable():Unit = editor.disable()
  def config():EditorOptions = editor.config()
  def cleanUp(rules:ParseRules):Unit = editor.cleanUp(rules)

  //https://github.com/Voog/wysihtml/wiki/Events
  def load(f: (Unit) => Unit) = editor.on("load",f)
  def focus(f: (Unit) => Unit) = editor.on("focus", f)
  def focusComposer(f: (Unit) => Unit) = editor.on("focus:composer", f)
  def focusTextarea(f: (Unit) => Unit) = editor.on("focus:textarea", f)
  def blur(f: (Unit) => Unit) = editor.on("blur", f)
  def blurComposer(f: (Unit) => Unit) = editor.on("blur:composer", f)
  def blurTextarea(f: (Unit) => Unit) = editor.on("blur:textarea", f)
  def change(f: (String) => Unit) = editor.on("change", f)
  def changeComposer(f: (String) => Unit) = editor.on("change:composer", f)
  def changeTextarea(f: (String) => Unit) = editor.on("change:textarea", f)
  def paste(f: (String) => Unit) = editor.on("paste", f)
  def pasteComposer(f: (String) => Unit) = editor.on("paste:composer", f)
  def pasteTextarea(f: (String) => Unit) = editor.on("paste:textarea", f)

  // https://github.com/Voog/wysihtml/wiki/Supported-Commands
  def addTableCells(cells: InsertTableCells) = editor.composer.commands.exec("addTableCells", cells.name)
  def bgColor(color: Color) = editor.composer.commands.exec("bgColor", color.toString)
  def bgColorStyle(color: Color) = editor.composer.commands.exec("bgColorStyle", color.toString)
  def bold() = editor.composer.commands.exec("bold")
  def createLink(link: Link) = editor.composer.commands.exec("createLink", link)
  def removeLink() = editor.composer.commands.exec("removeLink")
  def createTable(create: CreateTable) = editor.composer.commands.exec("createTable", create)
  def deleteTableCells(elm: TableElement) = editor.composer.commands.exec("deleteTableCells", elm.name)
  def fontSize(fontSize: String) = editor.composer.commands.exec("fontSize", fontSize)
  def fontSizeStyle(fontSize: String)  = editor.composer.commands.exec("fontSizeStyle", fontSize)
  def foreColor(color: Color) = editor.composer.commands.exec("foreColor", color.toString)
  def foreColorStyle(color: Color) = editor.composer.commands.exec("foreColorStyle", color.toString)
  //Please note: formatInline can be used to format the current selection into any inline element (span, strong, time, …). The following is an example using the SPAN tag.
  def formatBlock(format: Format) = editor.composer.commands.exec("formatBlock", format.tagName, format.className, format.classRegex)
  def formatInline(format: Format) = editor.composer.commands.exec("formatInline", format.tagName, format.className, format.classRegex)
  def insertHTML(html: String) = editor.composer.commands.exec("insertHTML", html)
  def insertImage(img: Img) = editor.composer.commands.exec("insertImage", img)
  def insertLineBreak() = editor.composer.commands.exec("insertLineBreak")
  def insertOrderedList() = editor.composer.commands.exec("insertOrderedList")
  def insertUnorderedList() = editor.composer.commands.exec("insertUnorderedList")
  def italic() = editor.composer.commands.exec("italic")
  def justifyCenter() = editor.composer.commands.exec("justifyCenter")
  def justifyLeft() = editor.composer.commands.exec("justifyLeft")
  def justifyRight() = editor.composer.commands.exec("justifyRight")
  //def mergeTableCells() TODO:
  def redo() = editor.composer.commands.exec("redo")
  def underline() = editor.composer.commands.exec("underline")
  def undo() = editor.composer.commands.exec("undo")
}

@js.native
trait EditorOptions extends js.Object{
  var name: js.UndefOr[String] = js.native
  var style: js.UndefOr[Boolean] = js.native
  var toolbar: js.UndefOr[String] = js.native
  var showToolbarAfterInit: js.UndefOr[Boolean] = js.native
  var showToolbarDialogsOnSelection: js.UndefOr[Boolean] = js.native
  var autoLink: js.UndefOr[Boolean] = js.native
  var handleTabKey: js.UndefOr[Boolean] = js.native
  var parserRules: js.UndefOr[ParseRules] = js.native
  var pasteParserRulesets: js.UndefOr[js.Array[ParseRules]] = js.native
  var copyedFromMarking: js.UndefOr[String] = js.native
  var parser: js.UndefOr[js.Function2[js.Any,js.Any,js.Any]] = js.native
  var classNames: js.UndefOr[ClassNames] = js.native
  var cleanUp: js.UndefOr[Boolean] = js.native
  var useLineBreaks: js.UndefOr[Boolean] = js.native
  var stylesheets: js.UndefOr[js.Array[String]] = js.native
  var placeholderText: js.UndefOr[String] = js.native
}


object EditorOptions {
  def apply(
        name: js.UndefOr[String] = js.undefined,
        style: js.UndefOr[Boolean] = js.undefined,
        toolbar: js.UndefOr[String] = js.undefined,
        showToolbarAfterInit: js.UndefOr[Boolean] = js.undefined,
        showToolbarDialogsOnSelection: js.UndefOr[Boolean] = js.undefined,
        autoLink: js.UndefOr[Boolean] = js.undefined,
        handleTabKey: js.UndefOr[Boolean] = js.undefined,
        parserRules: js.UndefOr[ParseRules] = js.undefined,
        pasteParserRulesets: js.UndefOr[js.Array[ParseRules]] = js.undefined,
        copyedFromMarking: js.UndefOr[String] = js.undefined,
        parser: js.UndefOr[js.Function2[js.Any,js.Any,js.Any]] = js.undefined,
        classNames: js.UndefOr[ClassNames] = js.undefined,
        cleanUp: js.UndefOr[Boolean] = js.undefined,
        useLineBreaks: js.UndefOr[Boolean] = js.undefined,
        stylesheets: js.UndefOr[js.Array[String]] = js.undefined,
        placeholderText: js.UndefOr[String] = js.undefined): EditorOptions = {
    val result = js.Dynamic.literal()
    name.foreach(result.name = _)
    style.foreach(result.style = _)
    toolbar.foreach(result.toolbar = _)
    showToolbarAfterInit.foreach(result.showToolbarAfterInit = _)
    showToolbarDialogsOnSelection.foreach(result.showToolbarDialogsOnSelection = _)
    autoLink.foreach(result.autoLink = _)
    handleTabKey.foreach(result.handleTabKey = _)
    parserRules.foreach(result.parserRules = _)
    copyedFromMarking.foreach(result.copyedFromMarking = _)
    parser.foreach(result.parser = _)
    classNames.foreach(result.classNames = _)
    cleanUp.foreach(result.cleanUp = _)
    useLineBreaks.foreach(result.useLineBreaks = _)
    placeholderText.foreach(result.placeholderText = _)
    stylesheets.foreach(result.stylesheets = _)
    result.asInstanceOf[EditorOptions]
  }
}


@js.native
trait ClassNames extends js.Object{
  var composer: js.UndefOr[String] = js.native
  var body: js.UndefOr[String] = js.native
  var sandbox: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var uneditableContainer: js.UndefOr[String] = js.native
}


object ClassNames {
  def apply(
      composer: js.UndefOr[String] = js.undefined,
      body: js.UndefOr[String] = js.undefined,
      sandbox: js.UndefOr[String] = js.undefined,
      placeholder: js.UndefOr[String] = js.undefined,
      uneditableContainer: js.UndefOr[String] = js.undefined): ClassNames = {
    val result = js.Dynamic.literal()
    composer.foreach(result.composer = _)
    body.foreach(result.body = _)
    sandbox.foreach(result.sandbox = _)
    placeholder.foreach(result.placeholder = _)
    uneditableContainer.foreach(result.uneditableContainer = _)
    result.asInstanceOf[ClassNames]
  }
}

