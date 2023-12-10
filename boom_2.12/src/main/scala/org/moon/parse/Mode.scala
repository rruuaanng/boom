package org.moon.parse

object Mode {
  val REGEX_ALL = Mode(1)
  val REGEX_FIRST = Mode(2)
}

case class Mode(v: Int)
