package com.scalatest.test.constructors

class ConstructorsTest (val field1: Int = 2, var field2: String = "hello") {
  def this(field3: String){this}

  override def toString = s"ConstructorsTest($field1, $field2)"
}

object ConstructorsTest {
  def main(args: Array[String]): Unit = {
    val testObject1 = new ConstructorsTest();
    println(testObject1.field1.toString);
    println(testObject1.field2);

    testObject1.field2 = "hi";
    println(testObject1);
  }
}