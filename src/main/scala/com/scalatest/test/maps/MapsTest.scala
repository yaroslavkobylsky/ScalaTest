package com.scalatest.test.maps

import scala.collection.mutable

object MapsTest {
  def main(args: Array[String]): Unit = {
    var map = scala.collection.mutable.Map("Hello" -> 22, "hi" -> 13);
    var seconMap = new scala.collection.mutable.HashMap[String, Int];

    println(map("Hello"));
    map.put("Hello", 23);
    println(map("Hello"));
    println(map.getOrElse("hi", 0));

    map += ("world" -> 11);
    println(map("world"));

    map -= "hi";
    println(map.getOrElse("hi", 0));
  }
}
