/**
 * File     : Chamber02.scala
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
 * Chamber 2: Matching by constant value.
 */
object Chamber02 extends App
  with ConsoleUtil
  with MatchByConstant {

  pad {
    print("How many chambers are there again? ")
    check { StdIn.readInt() }
  }

}

trait MatchByConstant {

  val ANSWER = 36

  def check(input: Int): Unit = println {
    input match {
      case ANSWER => "Correct!"
      case _      => "Try again..."
    }
  }

}
