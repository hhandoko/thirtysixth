/**
 * File     : Chamber08.scala
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
 * Chamber 8: Matching by (zero-constructor) case classes.
 */
object Chamber08 extends App
  with ConsoleUtil
  with MatchByEmptyCaseClass {

  pad {
    check { StdIn.readLine("Is the movie part of a trilogy? ") }
  }

}

trait MatchByEmptyCaseClass extends MatchUtil {

  def check(input: String): Unit = println {
    val answer = toBoolChoice(input)
    answer match {
      case True() => "Correct!"
      case _      => "Try again..."
    }
  }

}
