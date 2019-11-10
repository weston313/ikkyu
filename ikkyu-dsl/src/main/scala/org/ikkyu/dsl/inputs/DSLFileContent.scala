package org.ikkyu.dsl.inputs

import scala.io.Source
import util.control.Breaks._

case class DSLFileContent(filePath:String) extends DSLContent {

  override def getContent(): String = {
    val sb = new StringBuffer();
    val lines = Source.fromFile(filePath).getLines()
    while(lines.hasNext){
      breakable {
        val line = lines.next()
        if(line != null && !line.isEmpty) {
          sb.append(line.trim).append("\n")
        }
      }
    }
    sb.toString
  }
}
