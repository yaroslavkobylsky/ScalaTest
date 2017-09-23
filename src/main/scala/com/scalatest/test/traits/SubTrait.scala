package com.scalatest.test.traits

trait SubTrait extends FirstTrait {
  def sendMessage(message: String): Unit = {
    sendMessage("WARN: " + message);
  }
}
