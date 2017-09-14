/**
 * File     : Chamber07.scala
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
 * Chamber 7: Matching by case objects.
 */
object Chamber07 extends App
  with ConsoleUtil
  with MatchByCaseObject {

  pad {
    println("Which company produced the movie?")
    println("  A. Universal")
    println("  B. Legendary")
    println("  C. Shaw Brothers")
    println("  D. Madman")
    println("  E. Disney")
    check { StdIn.readLine() }
  }

}

trait MatchByCaseObject extends MatchUtil {

  def check(input: String): Unit = println {
    val answer = toMultiChoice(input)
    answer match {
      case C => "Correct!"
      case _ => "Try again..."
    }
  }

}
