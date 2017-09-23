package com.scalatest.test.traits

class SubClass extends SubTrait /*with FirstTrait*/{
  override var number: Int = 125;

  override def sendMessage(message: String): Unit = {println(message)};
}

object SubClass{
  def main(args: Array[String]): Unit = {
    val subClass = new SubClass;
    subClass.sendMessage("message");
  }
}
