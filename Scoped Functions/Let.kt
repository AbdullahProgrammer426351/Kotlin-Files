fun main(){
    val emp = Emp()
    // let function is easy way to access properties of a class through an object
    // Old way
    println(emp.age)
    println(emp.name)


    // New way (with let function)
    emp.let{
        // we can access properties using it.
        println(it.name)
        println(it.age)
        // By default its return value is Unit. If you want to return other thing else, you can write its value on end like:
        // 2---> if it will not be commented, it will be returned at the end of this let function 
    }

}

data class Emp(var name:String = "eee", var age:Int = 18)