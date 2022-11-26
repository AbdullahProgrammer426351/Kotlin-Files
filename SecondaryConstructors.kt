fun main(){
    var car = Vehicle("Car", 4, 44, "Petrol")// by default connstructor
    var car1 = Vehicle("car", "Deisel")// by secondary constructor
}



// Method 1
class Vehicle(val name: String, val tyres : Int, val maxSeating: Int, val engineParam:String){
    // primary constructor
    fun drive(){}
    fun applyBrakes(){}


    // specifying other constructors : 
    constructor(nameParam : String, engineParam:String) : this (nameParam, 4, 5, engineParam)

    // this constructor is helpful when we have to give default values to some properties of class as we gave default properties to tyres and maxseating. It is rule in kotlin that you have to call primary/default constructor from any secondary constructor.
}