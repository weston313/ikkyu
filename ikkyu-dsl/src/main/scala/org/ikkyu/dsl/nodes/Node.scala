package org.ikkyu.dsl.nodes

import org.ikkyu.dsl.nodes.NodeType.NodeType

trait Node {

  def getNodeType(): NodeType

  def getId(): String

}
