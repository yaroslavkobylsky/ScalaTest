package com.scalatest.test.inheritence.abstractclasses

abstract class AbstractClass {
  var field: String;
  def function: Int;

  override def toString: String = "adstract class: " + "field: " + field + ", function: " + function.toString;
}
