package com.scalatest.test.files

import java.io.File

import scala.io.Source

class WorkWithFiles {
}

object WorkWithFiles{
  def main(args: Array[String]): Unit = {
    for(file <- new File(".").listFiles ){
      println(file.getAbsolutePath)
    }

    var source  = Source.fromFile("textfile.txt", "UTF-8");
    println(source.mkString);
    println();
    source.close();

    source  = Source.fromFile("textfile.txt", "UTF-8");
    var arrayOfLines = source.toArray;
    for (line <- arrayOfLines){
      print(line);
    }
    source.close();



  }
}
