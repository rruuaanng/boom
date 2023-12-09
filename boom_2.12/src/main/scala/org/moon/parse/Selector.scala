package org.moon.parse

import scala.util.matching.Regex


trait Selector {
  def select(expr: String, mode: Mode): Option[List[Regex.Match]]
}