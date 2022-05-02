
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Hello")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
  """),format.raw/*3.3*/("""<section id="content">
    <div class="wrapper doc">
      <article>
        <h1>Hello World """),_display_(/*6.26*/name),format.raw/*6.30*/("""!</h1>
      </article>  
      <aside>
        """),_display_(/*9.10*/commonSidebar()),format.raw/*9.25*/("""
      """),format.raw/*10.7*/("""</aside>
    </div>
  </section>
""")))}))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-30T17:24:03.787321
                  SOURCE: /Users/champyevil/train/scala-exam/lightbend/play-samples-play-scala-hello-world-tutorial/app/views/hello.scala.html
                  HASH: 4c8c78ee9b2018aa4a06f7b24e5408fbb9e7227d
                  MATRIX: 729->1|837->17|858->30|897->32|926->35|1046->129|1070->133|1145->182|1180->197|1214->204
                  LINES: 21->1|26->2|26->2|26->2|27->3|30->6|30->6|33->9|33->9|34->10
                  -- GENERATED --
              */
          