package com.scalatest.test

class Children(var cschoolNumber: Int, override val cname: String, override val cage: Int)
extends Person(cname, cage){
  val schoolNumber: Int = cschoolNumber;

}
