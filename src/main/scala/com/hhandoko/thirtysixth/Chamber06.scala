/**
 * File     : Chamber06.scala
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

import scala.io.StdIn

/**
 * Chamber 6: Matching by (primitive) type and predicate.
 */
object Chamber06 extends App
  with ConsoleUtil
  with MatchByPrimitiveTypeWithPredicate {

  pad {
    check { StdIn.readLine("What year was he born? ") }
  }

}

trait MatchByPrimitiveTypeWithPredicate extends MatchUtil {

  def check(input: String): Unit = println {
    val answer: Any = if (isInt(input)) input.toInt else input
    answer match {
      case "early 50's"                    => "Correct!"
      case s: String if s.contains("50's") => "Almost, you're in the correct decade"
      case 51                              => "Correct!"
      case i: Int if i < 50                => "He's not that old"
      case i: Int if i <= 59               => "Almost, you're in the correct decade"
      case 1951                            => "Correct!"
      case _                               => "Try again..."
    }
  }

}
