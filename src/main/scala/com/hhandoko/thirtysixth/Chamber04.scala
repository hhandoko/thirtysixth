/**
 * File     : Chamber04.scala
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
 * Chamber 4: Matching with predicate.
 */
object Chamber04 extends App
  with ConsoleUtil
  with MatchWithPredicate {

  pad {
    check { StdIn.readLine("Who's the actor again? ") }
  }

}

trait MatchWithPredicate {

  def check(input: String): Unit = println {
    input match {
      case "Gordon Liu"               => "Correct!"
      case _ if input.startsWith("G") => "Not quite... Gordon something?"
      case _ if input.endsWith("Liu") => "Almost... It's Gordon Liu"
      case _                          => "Try again..."
    }
  }

}
