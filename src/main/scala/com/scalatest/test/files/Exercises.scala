package com.scalatest.test.files

import scala.io.Source

class Exercises {

  def getAllWordsMoreThan12Chars (fileName: String): Unit ={
    println(Source.fromFile(fileName, "UTF-8").mkString.split(" ").filter(_.length > 12).mkString(" "));
  }

  def getOnlyNumbers(fileName: String): Unit ={
    println(Source.fromFile(fileName, "UTF-8").buffered.toArray.filter(_ >'0').filter(_ <'9').mkString(" "));
  }

}

object Exercises{
  def main(args: Array[String]): Unit = {
    var exercises = new Exercises();
    exercises.getAllWordsMoreThan12Chars("textfile2.txt");
    println();
    exercises.getOnlyNumbers("textfile2.txt");
  }
}
