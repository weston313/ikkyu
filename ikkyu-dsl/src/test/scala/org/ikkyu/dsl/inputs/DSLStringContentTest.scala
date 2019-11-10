package org.ikkyu.dsl.inputs

import org.scalatest.FunSuite

class DSLStringContentTest extends FunSuite {

  test("main"){
    val dsl = "select '${columns}' from ${tablename} where P_date = '20191010';\n select * from users;\n" +
      "template add tableCount(name) {select * from ${name} where p_date = '20191010'; select * from ${name} where p_date = '20191011';}" +
    "template add tableCount(name) {select ${columns} from ${name} where p_date = '20191010';}"

    val content = new DSLStringContent(dsl)
    content.parse()
  }

}
