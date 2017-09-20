package com.scalatest.test.constructors

class ConstructorsTest2 {
  var classField: String = "classFiels";

  def this(field1: String){
    this;
    classField = field1;
  }

  def this( field2: Int){
    this;
    println("field2: " + field2);
  }

  def someMethod() = {
    "Hello"
  }
}

object ConstructorsTest2{
  def main(args: Array[String]): Unit = {
    var testObject = new ConstructorsTest2("Hello");
    println(testObject.someMethod());

    var testObject2 = new ConstructorsTest2("Hi");
    println(testObject2.classField);

    var testObject3 = new ConstructorsTest2(22);
  }
}


