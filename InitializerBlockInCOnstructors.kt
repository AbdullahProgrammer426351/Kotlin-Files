fun main(){
    var car = AutomobileClass("Car", 4, 44, true)
}

// if we want that some block of code should be executed while creating the instance of the class, we use initializer block as written below:

class AutomobileClass(val name:String, val tyres:Int, val maxSeating:Int, hasAirBags: Boolean){
    // firstly values will be assigned to all properties of the class and then init blocks will be executed in sequence
    // writting initializer block:
    init{
        println("Init - 1 : $name is created")
    }
    var airBags = hasAirBags
    init{
        println("Init - 2 : 2nd initializer blocks")
    }
    fun drive(){}
    fun applayBrakes(){}
}