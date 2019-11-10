package org.ikkyu.dsl.antlr.line

import org.ikkyu.dsl.antlr.AntlrExtends

import scala.collection.mutable.ArrayBuffer

class DSLLineListerner(bytes: Array[Byte]) extends DslLineBaseListener with AntlrExtends {

  private val dslLines = new ArrayBuffer[String]()

  def getDSLLines():Seq[String] = dslLines

  override def exitSemicolonLine(ctx: DslLineParser.SemicolonLineContext): Unit = {
    val line = parseMatchedContext(bytes, ctx)
    println("semicolon line " + line)
    dslLines += line
  }

  override def exitFunctionLine(ctx: DslLineParser.FunctionLineContext): Unit = {
    val line = parseMatchedContext(bytes, ctx)
    println("function line " + line)
    dslLines += line
  }
}
