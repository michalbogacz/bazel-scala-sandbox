package cmd

import lib.Greeting

object Runner {
  def main(args: Array[String]): Unit =
    println(Greeting.createHiMessage("Alex"))
}
