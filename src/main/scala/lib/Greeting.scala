package lib

object Greeting {
  private val greet: String = "Hi"

  def createHiMessage(name: String) = s"$greet $name!"
}