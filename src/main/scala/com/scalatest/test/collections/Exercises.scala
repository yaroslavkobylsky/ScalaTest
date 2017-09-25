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
    var list2 = List("one", "two", "three");
  }
}
