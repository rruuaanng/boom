package org.moon.parse

object RegexUtils {
  // 获取HTML标签的属性集
  def HTMLAttrs(e: String) = s"""<$e\\s+([^>]*)>"""

  // 获取HTML属性集中的单个属性
  def HTMLAttr(a: String) = s"""$a="(.*?)""""

  // 获取HTML指定标签
  def HTMLElem(e: String) = s"""<$e>(.*?)</$e>"""
}
