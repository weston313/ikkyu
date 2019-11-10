package org.ikkyu.dsl.inputs

import org.scalatest.FunSuite

class DSLFileContentTest extends FunSuite {

  test("main"){
    val path = "/Users/wozipa/ProductCode/ikkyu/ikkyu-dsl/src/test/resources/test.dsl"

    val content = new DSLFileContent(path)
    content.parse()
  }

}
