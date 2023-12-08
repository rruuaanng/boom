package org.moon.parse

class SelectorRegex(text: String) extends Selector {
  /**
   * 匹配所有匹配的字符串
   *
   * @param re 正则表达式
   * @return 匹配字符串列表
   */
  def getAllMatch(re: String) = {
    val results = Option(re.r.findAllMatchIn(text).toList)
    // 若匹配则返回匹配集
    // 否则返回空
    results match {
      case Some(_) => results
      case None => None
    }
  }

  /**
   * 获取第一个匹配的字符串
   * 若未匹配到则返回空串
   *
   * @param re 正则表达式
   * @return 匹配字符串
   */
  def getFirstMatch(re: String) = {
    val result = re.r.findFirstMatchIn(text)
    // 若匹配则返回匹配集
    // 否则返回空
    result match {
      case Some(_) => result
      case None => None
    }
  }
}




