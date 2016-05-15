import SonatypeKeys._

import sbt.Keys._

sonatypeSettings

lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)

name := "ScalaJS WysiHTML."

normalizedName := "scala-js-wysihtml"

version := "0.1-SNAPSHOT"

organization := "io.surfkit"

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.10.4", "2.11.5")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0"
)

jsDependencies in Test += RuntimeDOM

homepage := Some(url("http://www.surfkit.io/"))

licenses += ("MIT License", url("http://www.opensource.org/licenses/mit-license.php"))

scmInfo := Some(ScmInfo(
    url("https://github.com/coreyauger/scala-js-wysihtml"),
    "scm:git:git@github.com/coreyauger/scala-js-wysihtml.git",
    Some("scm:git:git@github.com:coreyauger/scala-js-wysihtml.git")))

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
  <developers>
    <developer>
      <id>coreyauger</id>
      <name>Corey Auger</name>
      <url>https://github.com/coreyauger/</url>
    </developer>
  </developers>
)

pomIncludeRepository := { _ => false }

