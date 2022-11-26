fun main() {
    // val circle : Circle = Circle(4.0)
    // val square : Square = Square(4.0)
    // this was the old method

    // polymorphism means reference of parent class and references of child class. But only those
    // methods will be called that are common in both child and parent classes. And that methods
    // will be executed of child class
    
    val circle: Shape = Circle(4.0)// polymorphism
    val square: Shape = Square(4.0)// polymorphism

    println(circle.area())
    println(square.area())

    // the below code is valid due to polymorphism. We can also pass child obejcts of a parent class. But this method requires datatype of parent class
    displayArea(circle)
    displayArea(square)
}

fun displayArea(val param:Shape){
    println("This is display area method")
}

open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}
