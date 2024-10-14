package com.example

import lib.Greeting
import org.scalatest.funsuite.AnyFunSuite

class ExampleTest extends AnyFunSuite {
  test("example") {
    assert(Greeting.createHiMessage("test") == "Hi test!")
  }
}
