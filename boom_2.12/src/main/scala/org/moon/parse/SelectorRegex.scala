package org.moon.parse

import scala.util.matching.Regex

/**
 * 正则选择器
 *
 */
class SelectorRegex extends Selector {

  private var text: Option[String] = None

  /**
   * 匹配对应模式的表达式
   *
   * @param re   正则表达式
   * @param mode 匹配规则
   * @return 匹配列表
   */
  override def select(re: String, mode: Mode): Option[List[Regex.Match]] = {
    // 若未设置匹配文本直接退出函数
    if (text eq None) return None
    mode match {
      case Mode.REGEX_ALL => matchAll(re)
      case Mode.REGEX_FIRST => matchFirst(re)
      case _ => None
    }
  }

  /**
   * 设置匹配文本
   *
   * @param str 字符串
   * @return
   */
  def setText(str: String): SelectorRegex = {
    this.text = Option(str)
    this
  }

  private def matchAll(re: String) = {
    val results = Option(re.r.findAllMatchIn(text.get).toList)
    // 若匹配则返回匹配集
    // 否则返回空
    results match {
      case Some(_) => results
      case None => None
    }
  }

  private def matchFirst(re: String) = {
    val result = re.r.findFirstMatchIn(text.get)
    // 若匹配则返回匹配集
    // 否则返回空
    result match {
      case Some(_) => Option(List(result.get))
      case None => None
    }
  }
}

