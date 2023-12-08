package org.moon.parse

object HTMLRegex {
  // 获取标签的属性集
  def attributes(e: String) = s"""<$e\\s+([^>]*)>"""

  // 获取属性集中的单个属性
  def attribute(a: String) = s"""$a="(.*?)""""

  // 获取指定标签
  def element(e: String) = s"""<$e>(.*?)</$e>"""
}
