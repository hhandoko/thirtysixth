/**
 * File     : Chamber09.scala
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
 * Chamber 9: Matching by tuples.
 */
object Chamber09 extends App
  with ConsoleUtil
  with MatchByTuples {

  pad {
    println("Name the sequels in the series: ")
    check(
      StdIn.readLine("  Second in the trilogy is - "),
      StdIn.readLine("  Last in the trilogy is   - ")
    )
  }

}

trait MatchByTuples extends MatchUtil {

  def check(input1: String, input2: String): Unit = println {
    val answer1 = input1.trim.equalsIgnoreCase("return to the 36th chamber")
    val answer2 = input2.trim.equalsIgnoreCase("disciples of the 36th chamber")
    (answer1, answer2) match {
      case (true, true) => "Correct!"
      case (true, _   ) => "Check your second answer"
      case (_   , true) => "Check your first answer"
      case _            => "Try again..."
    }
  }

}
