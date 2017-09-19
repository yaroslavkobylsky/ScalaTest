package com.scalatest.test

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
  }

}
