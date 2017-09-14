/**
 * File     : Commons.scala
 * License  :
 *   Copyright (c) 2017 Herdy Handoko
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
import sbt.Keys._
import sbt.util.Level

/**
 * Centralised project configuration.
 */
object Commons {

  private val organisation = "com.hhandoko"
  private val appVersion = "0.1.0-SNAPSHOT"
  private val scalaCompilerVersion = "2.12.3"
  private val scalaCompilerOptions = Seq(
    "-deprecation",            // Emit warning and location for usages of deprecated APIs
    "-encoding", "UTF-8",
//    "-feature",                // Emit warning and location for usages of features that should be imported explicitly
    "-unchecked",              // Enable additional warnings where generated code depends on assumptions
//    "-Xfatal-warnings",        // Fail the compilation if there are any warnings
    "-Xlint",                  // Enable recommended additional warnings
    "-Ywarn-adapted-args",     // Warn if an argument list is modified to match the receiver
    "-Ywarn-dead-code",        // Warn when dead code is identified
    "-Ywarn-inaccessible",     // Warn about inaccessible types in method signatures
    "-Ywarn-infer-any",        // Warn when a type argument is inferred to be `Any`
    "-Ywarn-nullary-override", // Warn when non-nullary overrides nullary, e.g. def foo() over def foo
    "-Ywarn-nullary-unit",     // Warn when nullary methods return Unit
    "-Ywarn-numeric-widen",    // Warn when numerics are widened
    "-Ywarn-unused",           // Warn when local and private vals, vars, defs, and types are unused
    "-Ywarn-unused-import",    // Warn when imports are unused
    "-Ywarn-value-discard"     // Warn when non-Unit expression results are unused
  )

  /** Bundled common settings */
  val settings = Seq(
    // Scala settings
    scalaVersion := scalaCompilerVersion,
    scalacOptions ++= scalaCompilerOptions,

    // Project information
    organization := organisation,
    version := appVersion,

    // Module(s) dependencies
    libraryDependencies ++= Dependencies.dependencies
  )

}
