object HelloWorld {
  def main(args: Array[String]): Unit = {
    var x: String = "Hello"
    val plusOne = (x: Int) => x+1
    val myName = () => "Champ"
    val point = Point(1, 2)
    val anotherPoint = Point(1, 2)
    val yetAnotherPoint = Point(2, 2)
    println("Hello, World!!!!")
    println(x + ' ' + plusOne(2))
    println({
      var x = 1+1
      x + " " + myName()
    })
    println(add(2,3))
    println(addThenMultiple(2,3)(2))
    val name: MyNameIs = new MyNameIs("Mr. ")
    name.printName("Champ")
    if (point == anotherPoint) {
      println(point + " and " + anotherPoint + " are the same.")
    } else {
      println(point + " and " + anotherPoint + " are different.")
    }
    
    if (point == yetAnotherPoint) {
      println(point + " and " + yetAnotherPoint + " are the same.")
    } else {
      println(point + " and " + yetAnotherPoint + " are different.")
    }

    val newId: Int = IdFactory.create()
    println(newId) // 1
    val newerId: Int = IdFactory.create()
    println(newerId) // 2
  }

  def add(x: Int, y: Int): Int = {
    x+y
  }
  def addThenMultiple(x: Int, y: Int)(multi: Int): Int = {
    (x+y)*multi
  }

  class MyNameIs(prefix: String){
    def printName(name: String): Unit = {
      println(prefix + name)
    }
  }

  case class Point(x: Int, y: Int)

  object IdFactory {
    private var counter = 0
    def create(): Int = {
      counter += 1
      counter
    }
  }
}