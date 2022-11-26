fun main(){
    // val shape = Shape()
    // println(shape.area())
    // shape.display()

    val circle = Circle(4.0)
    println(circle.area())
    circle.display()
}

abstract open class Shape{
    var name:String = ""
    // below method is abstract method. abstract methods are by default open. we don't need to write open.
    abstract fun area() : Double
    open fun display() = println("Shape is getting displayed")

    // class containing abstract method must be abstract
    // abstract class can have both abstract and non abstract properties and methods


    // sometimes we use abstract keyword with those classes  which we want to not use in code but  only allow these classes for inheritance
}

class Circle(val radius:Double) : Shape(){
    override fun area():Double = Math.PI * radius * radius
    override fun display(){
        println("Circle is getting displayed")
    }
}