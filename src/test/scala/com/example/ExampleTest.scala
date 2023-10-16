package com.example

import org.scalatest.funsuite.AnyFunSuite

class ExampleTest extends AnyFunSuite {
  test("example") {
    assert(Greeting.createHiMessage("test") == "Hi test!")
  }
}