package com.scalatest.test

object StringTest {
  def main(args: Array[String]): Unit = {
    println("A" + "B");
    println("A".concat("B"));
    println(new String("A") + new String("B"));
    println(new String("Hello")(2));
    println(new String("Hello").last);
    println(new String("Hello").head);
    println(new String("Hello").tail);
  }

}
