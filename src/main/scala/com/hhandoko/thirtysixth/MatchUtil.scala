/**
 * File     : MatchUtil.scala
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
package com.hhandoko.thirtysixth

/**
 * Various matchers utility.
 */
trait MatchUtil {

  protected def isInt(input: String): Boolean = {
    try {
      input.toInt
      true
    } catch {
      case _: Exception => false
    }
  }

  protected def toMultiChoice(input: String): MultipleChoiceCaseObject = {
    input.trim.toUpperCase() match {
      case "A" => A
      case "B" => B
      case "C" => C
      case "D" => D
      case _   => E
    }
  }

  protected def toBoolChoice(input: String): MultipleChoiceCaseClass = {
    val truePredicate = Seq("true", "yes", "y", "on")
    input.trim.toLowerCase() match {
      case i if truePredicate.contains(i) => True()
      case _                              => False()
    }
  }

}
