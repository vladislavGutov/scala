/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2006, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$


package scala;


case class Tuple7[+T1, +T2, +T3, +T4, +T5, +T6, +T7](_1: T1, _2: T2, _3: T3, _4: T4, _5: T5, _6: T6, _7: T7) {
  override def toString(): String = "(" + _1 + "," + _2 + "," + _3 + "," + _4 + "," + _5 + "," + _6 + "," + _7 + ")";
}
