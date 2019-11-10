package org.ikkyu.dsl.inputs

case class DSLStringContent(dsl:String) extends DSLContent {

  override def getContent(): String = {
    val sb = new StringBuffer()
    val lines = dsl.split("\\n");
    for(line <- lines) {
      if(line != null && !line.isEmpty){
          sb.append(line.trim).append("\n")
      }
    }
    sb.toString
  }
}
