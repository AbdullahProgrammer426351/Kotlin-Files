fun main(){
    var score = 5
    score = 10
    print(score)

    val message = "This is a val variable"
    // message = "new variable" --> not allowed here. because it cannot be changed
    print(message)


    // there are two ways to make variables in kotlin
    //1. var --- it is used to make non-final variables. its value can be changed
    //2. val --- it is used to make final variables or constants. its value cannot be changed



    // data types:
    // kotlin automatically detects of which datatype value is assigned to it. If we try to give another datatype value after initializing it, it gives error. This feature is called type checking. We have not to specify datatype.



    // But if we want to define data type, then we have to write code like this:
    var game_score : Int = 12 // integer datatype
    var temprature : Double = 23.8// Float datatype
    var isRaining : Boolean = false// boolean datatype
    var alphabet : Char = 'A'
    var new_message : String = "This is our new message"

}