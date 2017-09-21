package com.scalatest.test.inheritence.abstractclasses

class SubClass (var variable: String) extends AbstractClass {
  override var field: String = "field";

  override def function: Int = 123;


  override def toString = s"SubClass($field, $variable, $function)"
}

object SubClass{
  def main(args: Array[String]): Unit = {
    var subClass = new SubClass("subclass");
    println(subClass.toString);
  }
}
