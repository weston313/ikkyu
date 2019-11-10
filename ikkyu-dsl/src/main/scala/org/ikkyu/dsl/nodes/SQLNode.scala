package org.ikkyu.dsl.nodes
import org.ikkyu.dsl.nodes.NodeType.NodeType

class SQLNode(sql:String) extends AbstractNode {

  assert(sql != null && !sql.isEmpty, "The Sql is empty.")

  override def getNodeType(): NodeType = NodeType.sqlNode

  override def toString: String = {
    val sb = new StringBuffer()
    sb.append("SQLNode(")
      .append("id: ").append(this.id)
      .append("sql: ").append(this.sql)
      .append(")")
      .toString
  }
}
