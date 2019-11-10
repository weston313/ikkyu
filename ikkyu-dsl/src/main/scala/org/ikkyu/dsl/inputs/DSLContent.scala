package org.ikkyu.dsl.inputs

import org.antlr.v4.runtime.{ANTLRInputStream, CharStream, CharStreams, CommonTokenStream}
import org.ikkyu.dsl.antlr.line.{DSLLineListerner, DslLineLexer, DslLineParser}

trait DSLContent {

  def getContent(): String

  def parse():Seq[String] = {

    val content = getContent()
    val bytes = content.getBytes()
    val upContent = content.toUpperCase()

    val lexer = new DslLineLexer(CharStreams.fromString(upContent))
    val parser = new DslLineParser(new CommonTokenStream(lexer))

    val listerner = new DSLLineListerner(bytes)
    parser.addParseListener(listerner)
    parser.root()

    listerner.getDSLLines()
  }

}
