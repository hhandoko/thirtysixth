/**
 * File     : Chamber10.scala
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
 * Chamber 10: Matching against multiple types.
 */
object Chamber10 extends App
  with ConsoleUtil
  with MatchByMultipleType {

  pad {
    println("By what other titles does the movie known as? ")
    println("  A. The Master Killer")
    println("  B. Shaolin Master Killer")
    println("  C. 少林三十六房")
    println("  D. Challenge of the Masters")
    println("  E. Executioners from Shaolin")
    check { StdIn.readLine() }
  }

}

trait MatchByMultipleType extends MatchUtil {

  def check(input: String): Unit = println {
    val answer = toMultiChoice(input)
    answer match {
      case _ @ (A | B | C) => "Correct!"
      case _               => "Try again..."
    }
  }

}
