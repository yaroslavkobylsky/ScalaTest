package com.scalatest.test.functions

object FunctionsTest{
  def main(args: Array[String]): Unit = {
    def absFunc (item: Double) = scala.math.abs(item);
    println(absFunc(-20));
    val array = Array(-3, -2, 5, 25, 1.25, -120);
    println(array.map(absFunc).foreach(println(_)));

    val expFunc = scala.math.exp _;
    println(array.map(expFunc).foreach(println(_)));

    val myFunc = (x: Double) => x * 10;
    println(myFunc(12.5));

    println(array.map((x: Double) => x * 10).mkString(" "));

    def funcWithFuncParam (f:Double => Double, x: Double) = f(x)*2;
    println(funcWithFuncParam(myFunc, 1000));


  }
}
