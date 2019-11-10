package org.ikkyu.dsl.antlr

import org.antlr.v4.runtime.{ParserRuleContext, Token}

trait AntlrExtends {

  def parseMatchedContext(bytes: Array[Byte], ctx: ParserRuleContext): String = {
    // check context
    if(ctx == null || ctx.getStart == null || ctx.getStop == null || bytes == null || bytes.size == 0) return "";

    // get content string
    val startIndex = ctx.getStart.getStartIndex
    val stopIndex = ctx.getStop.getStopIndex
    if(startIndex >= stopIndex) return "";
    new String(bytes, startIndex, stopIndex + 1 - startIndex)

  }

  def parseMatchedToken(bytes: Array[Byte], token: Token): String = {
    if(bytes == null || bytes.size == 0 || token == null) return "";
    new String(bytes, token.getStartIndex, token.getStopIndex + 1 - token.getStartIndex)
  }

}
