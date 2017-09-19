package com.scalatest.test

object FunctionTest {

  def main(args: Array[String]): Unit = {
    var string = {
      "hello" + " " + "world";
    }
    println(string);

    var int = {
      2;
    }
    println(int);

    varArgsFunc(1, 2, 3, 4);

    println();
    println("result: " + charMultiplication("Hello"))
  }
  def varArgsFunc (args: Int*) = {
    print("arguments: ");
    for (arg <- args){
      print(arg + " ");
    }
  }

  def charMultiplication(input: String) = {
    var result: Long = 1;
    for(char <- input){
      result = result * char;
    }
    result;
  }

}
