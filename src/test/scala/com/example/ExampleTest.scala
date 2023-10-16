package com.example

import org.scalatest.funsuite.AnyFunSuite
import lib.Greeting

class ExampleTest extends AnyFunSuite {
  test("example") {
    assert(Greeting.createHiMessage("test") == "Hi test!")
  }
}