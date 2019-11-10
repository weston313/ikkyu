package org.ikkyu.dsl.nodes

abstract class AbstractNode extends Node {

  lazy protected val id = hashCode().toString

  override def getId(): String = this.id



}
