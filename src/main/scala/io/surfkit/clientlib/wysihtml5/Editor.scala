package io.surfkit.clientlib.wysihtml5

import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * Created by corey auger
 */

@JSName("wysihtml.Editor")
@js.native
class Editor(domId: String, options: EditorOptions) extends js.Object{
  def setValue(html: String, parse: Boolean = true):Unit = js.native
  def getValue(parse: Boolean = true): String = js.native
  def isCompatible():Boolean = js.native
  def hasPlaceholderSet():Boolean = js.native
  def focus():Unit = js.native
  def enable():Unit = js.native
  def disable():Unit = js.native
  def config():EditorOptions = js.native
  def cleanUp(rules:ParseRules):Unit = js.native
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

