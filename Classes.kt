fun main(){
    val mustang = Car("mustang", "petrol", 100)

    println(mustang.name)
    println(mustang.type)

    mustang.driveCar()
    mustang.applyBrakes()
}

class Car(val name : String, val type : String, var kmRan : Int)// peroperties
{
    // name, type and kmRan are properties of this class

    // making functions in Car class
    fun driveCar(){
        println("$name Car is driving")
    }

    fun applyBrakes(){
        println("Applied brakes")
    }
}