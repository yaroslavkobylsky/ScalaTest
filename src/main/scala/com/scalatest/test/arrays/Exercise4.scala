package com.scalatest.test.arrays

import scala.collection.mutable.ArrayBuffer

class Exercise4 {
  def exerciseSort (array: Array[Int]) ={
    val result = array.filter(_ < 0) ++ array.filter(_ >= 0);
    result;
  }
}
