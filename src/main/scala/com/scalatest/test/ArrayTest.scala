package com.scalatest.test

import scala.util.Sorting

object ArrayTest {
  def main(args: Array[String]): Unit = {
    var myList = Array(1.9, 2.9, 3.4, 3.5);
    for (x <- myList){
      print(x + " ");
    }

    var myMatrix = Array.ofDim[Int](3,3)

    for (i: Int <- 0 to 2) {
      for (j:Int <- 0 to 2){
        myMatrix(i)(j) = j + i;
      }
    }

    for (i: Int <- 0 to 2) {
      for (j:Int <- 0 to 2){
        print(myMatrix(i)(j))
      }
      println();
    }

    val array = Array(1,2,5,6,9,12,13,20);
    println(array.mkString(" "));
    println(array.sum);
    println(array.min);
    println(array.max);
    println(array.sorted.reverse.mkString(" "));
    Sorting.quickSort(array);
    println(array.mkString(" "));
    println(array.sorted.reverse(0));
    println("devide by 2: " + array.count(_ % 2 == 0));

    println();
    println((for (element <- array) yield {2 * element;}).mkString(" "));
    println((array.map(2 * _)).mkString(" "));
    println();
    println((for (element <- array if (element % 2 == 0)) yield {2 * element;}).mkString(" "));
    println((array.filter(_ % 2 == 0).map(2 * _)).mkString(" "));

  }
}
