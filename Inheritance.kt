fun main(){
    val objChild = Child()
    objChild.myMethod()// calling parent class method
    objChild.myMethod2()// calling child class method


    // If we study about the sequence od constructors to be executed. In kotlin, parent constructor is called first and then next the child class constructor is executed
}


// in kotlin, we have to tell compiler that this class can be used for inheritance or not. To enable inheritance(parent), we have to add keyword 'open' to open that class for making it parent like bellow.

open class Parent{
    init{
        println("Parent  constructor is called")
    }
    val name : String = ""
    fun myMethod(){
        println("I am a parent")
    }
}

class Child : Parent(){
    init{
        println("Child  constructor is called")
    }
    val name2:String = ""
    fun myMethod2(){
        println("I am in child")
    }
}