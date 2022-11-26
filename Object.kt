fun main(){
    // In kotlin, we can also make direct objects without making and initializing classes

    // accessing properties and methods of objects
    println(A1.num)
    A2.test()
}

object A1{
    val num : Int = 10
}

object A2{
    val p:Int = 20
    fun test(){
        println("I am object B")
    }
}


/*
Important points:
1. If we have to  use object only once, we should make object. But when we have to use same object or properties many times in code, we should make class
2. Constructors are not allowed in objects. init methods are allowed
3. You can inherit a class or interface from object
*/
