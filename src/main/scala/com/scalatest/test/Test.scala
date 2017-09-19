package com.scalatest.test

object Test {
  def main(args:  Array[String]): Unit = {
    var person: Person = new Person("Vovan", 35);
    println(person);

    var children: Children = new Children(12,"Dmytry", 6);
    println(children.schoolNumber);
  }

}
