fun main(){
    val emp = Employee()
    emp.age = 20
    emp.name = "John"

    // above method was for setting values of properties of dataclass.
    // But 'apply' function makes it easy for us. like:

    emp.apply{
        age = 30
        name = "Abdullah"
    }
    // In this way, we have not to write 'emp.' for every line
    println(emp)


    // Important Note 1 : these will be an object 'this' inside apply body which will point to that object
    // Important Note 2 : return value of apply function will be the same object of which properties you are setting. We can also save its value in an integer
}

data class Employee(var name:String = "", var age:Int = 18)