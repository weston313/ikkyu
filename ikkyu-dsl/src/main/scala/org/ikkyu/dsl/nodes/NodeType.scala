package org.ikkyu.dsl.nodes

object NodeType extends Enumeration {

  type NodeType = Value

  // the node type of read data
  val readFile = Value("readFile")
  val readDBTable = Value("readDBTable")

  // node type of writing data
  val writeFile = Value("writeFile")
  val writeDBTable = Value("writeDBTable")

  // sql node
  val sqlNode = Value("sqlNode")

}
