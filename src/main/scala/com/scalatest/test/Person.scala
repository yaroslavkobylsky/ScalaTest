package com.scalatest.test

class Person (val cname: String, val cage: Int) {
  val name: String = cname;
  val age: Int = cage;

  override def toString = "person:" + name;


}


