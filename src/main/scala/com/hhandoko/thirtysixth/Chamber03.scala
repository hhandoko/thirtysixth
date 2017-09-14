/**
 * File     : Chamber03.scala
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
 * Chamber 3: Matching by enumeration.
 */
object Chamber03 extends App
  with ConsoleUtil
  with MatchByEnumeration {

  pad {
    check { Days.withName(StdIn.readLine("What day would you like to watch it? ")) }
  }

}

trait MatchByEnumeration {

  def check(input: Days.Value): Unit = println {
    import Days._
    input match {
      case SATURDAY => "Great, let's do it!"
      case SUNDAY   => "Sounds OK, as long as it's not too late..."
      case _        => "Weekdays are not good for me."
    }
  }

}

object Days extends Enumeration {

  val MONDAY    = Value("Monday")
  val TUESDAY   = Value("Tuesday")
  val WEDNESDAY = Value("Wednesday")
  val THURSDAY  = Value("Thursday")
  val FRIDAY    = Value("Friday")
  val SATURDAY  = Value("Saturday")
  val SUNDAY    = Value("Sunday")

}
