package io.surfkit.clientlib.wysihtml5

import scala.scalajs.js

/**
  * Created by coreyauger
  */

//https://github.com/Voog/wysihtml/wiki/parserRules
@js.native
trait ParseRules extends js.Object{
  var attributes: js.UndefOr[js.Dynamic] = js.native
  var classes: js.UndefOr[js.Dynamic] = js.native
  var classes_blacklist: js.UndefOr[js.Dynamic] = js.native
  var type_definitions: js.UndefOr[js.Dynamic] = js.native
  var comments: js.UndefOr[Boolean] = js.native
  var tags: js.UndefOr[js.Dynamic] = js.native
}


object ParseRules {
  def apply(
      attributes: js.UndefOr[js.Dynamic] = js.undefined,
      classes: js.UndefOr[js.Dynamic] = js.undefined,
      classes_blacklist: js.UndefOr[js.Dynamic] = js.undefined,
      type_definitions: js.UndefOr[js.Dynamic] = js.undefined,
      comments: js.UndefOr[Boolean] = js.undefined,
      tags: js.UndefOr[js.Dynamic] = js.undefined): ParseRules = {
    val result = js.Dynamic.literal()
    attributes.foreach(result.attributes = _)
    classes.foreach(result.classes = _)
    classes_blacklist.foreach(result.classes_blacklist = _)
    type_definitions.foreach(result.type_definitions = _)
    comments.foreach(result.comments = _)
    tags.foreach(result.tags = _)
    result.asInstanceOf[ParseRules]
  }


  val simpleParserRules = ParseRules(
    tags = js.Dynamic.literal(
      "h1"     -> js.Object,
      "h2"     -> js.Object,
      "h3"     -> js.Object,
      "h4"     -> js.Object,
      "strong" -> js.Object,
      "b"      -> js.Object,
      "i"      -> js.Object,
      "em"     -> js.Object,
      "br"     -> js.Object,
      "p"      -> js.Object,
      "div"    -> js.Object,
      "span"   -> js.Object,
      "ul"     -> js.Object,
      "ol"     -> js.Object,
      "li"     -> js.Object,
      "a"      -> js.Dynamic.literal(
        "set_attributes" -> js.Dynamic.literal(
          "target" -> "_blank",
          "rel"    -> "nofollow"
          ),
          "check_attributes" -> js.Dynamic.literal (
          "href" ->  "url" // important to avoid XSS
          )
        )
    )
  )
}
