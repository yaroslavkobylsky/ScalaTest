package com.scalatest.test.inheritence

class SecondClass (name: String, age: Int, role: String)  extends FirstClass (name: String, age: Int) {
  override def toString : String = name + " " + age.toString + " " + role;
}

object SecondClass{
  def main(args: Array[String]): Unit = {
    var secondClass = new SecondClass("name", 11, "role");
    println(secondClass.toString);
  }
}