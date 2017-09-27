package com.scalatest.test.collections

class Exercises {
  def stringToIndexesMap(word: String): Unit ={
    println(word.zipWithIndex.mkString(" "));
  }
}

object Exercises{
  def main(args: Array[String]): Unit = {
    val exercises = new Exercises;
    exercises.stringToIndexesMap("Missisippi");

    println("---------LIST-----------")
    var list = List("one", "two", "three", "four", "five", "six", "seven");
    println("list: " + list.mkString(""));
    println(list.drop(2).mkString(" "));
    println("head:" + list.head);
    println("tail: " + list.tail.mkString(" "));
    println("tail2: " + list.tail.tail.mkString(" "));
    println("number of equals two: " + list.count(_.equals("two")));
    println("number of contains o: " + list.filter(_.contains('o')).mkString(" "));
    println("number of chars: " + list.map(_.length).mkString(" "));
    println("number of chars overall: " + list.map(_.length).sum);
    println("min: " + list.min);
    println("max: " + list.max);
    def numberToUpperCase(string: String) = {List(string, string.toUpperCase)};
    println("flat map: " + list.flatMap(numberToUpperCase(_)).mkString(" "));
    def getDistinctLength(string: String) = {string.distinct.length};
    println("ordered by distinct len: " + list.sorted(Ordering.by(getDistinctLength(_))).mkString(" "));
    println("sorted: " + list.sorted.mkString(" "));
    println("reverse sorted: " + list.sorted.reverse.mkString(" "));
    println("add another list: " + (list ++ (List("eight", "nine", "ten"))).mkString(" "));
    println("reduce left: " + list.reduceLeft(_ + _));
    println("char sum with reduce left: " + list.reduceLeft(_ + _).length);
    println("reduce right: " + list.reduceRight(_ + _));
    println("drop while: " + list.dropWhile(_.length > 4).mkString(" "));

    println("---------SET-----------")
    var set = Set("one", "two", "three", "four", "five", "six", "seven");
    println("set: " + set.mkString(" "));
    println("set with filter: " + set.filter(_.length > 3).mkString(" "));
    println("set with filter: " + set.filter(_ > "five").mkString(" "));
    println("set is contain: " + set.contains("one"));
    println("set drop: " + set.drop(2).mkString(" "));
    println("set for each: " + set.foreach(print(_)));
    println("set map: " + set.map(_ + "___").mkString(" "));
    println("set flat map: " + set.flatMap(_.distinct.toUpperCase).mkString(" "));
    var set2 = Set("one", "two", "three");
    var set3 = Set("eight", "nine", "ten");
    println("set add to set: " + (set ++ set3).mkString(" "));
    println("set sub from set: " + (set -- set2).mkString(" "));
    println("set & set: " + (set & set2).mkString(" "));
    println("set || set: " + (set | set3).mkString(" "));
    println("set zip set: " + (set zip(set3)).mkString(" "));
    println("set zip set: " + (set zip(set2)).mkString(" "));

    println("---------MAP-----------")
    val map = Map("one" -> 1, "two" -> 2, "three" -> 3, "four" -> 4, "five" -> 5, "six" -> 6, "seven" -> 7);
    println("map: " + map.mkString(" | "));
    println("map get: " + map.getOrElse("one", 0).toString);
    println("map contains: " + map.contains("one"));
    println("map drop right: " + map.dropRight(2));
    println("map drop left: " + map.drop(2));
    def dropWhileMap(string: String, int: Int): Boolean = {string.length >3};
  }
}
