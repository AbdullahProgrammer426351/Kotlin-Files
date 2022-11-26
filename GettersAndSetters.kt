fun main(){
    val p1 = Person("Cheezy", 21)
    // if we have to get value of properties of Person class, then
    var age = p1.age
    // if we have to set value of properties of Person class, then
    p1.age = 30

    // But if we use above method, their are high chances of logical error such as age parameter can be set to negative which is an illogical statement. For this  validation, we use getters and setters. When we will make methods for  getter and setter in class, above code will used automatically as getter and setter

    println(p1.name)


}

class Person(nameParam : String, ageParam: Int){
    var name:String  = nameParam
    // making getter
    get(){
        return field.toUpperCase()
    }
    var age:Int  = ageParam
    // making setter
    set(value){
        if(value>0){
            field = value
        }else{
            println("Age can't be negative")
        }
    }


    // default code for getter and setter
    var email:String = ""
    get() = field
    set(value){
        field = value
    }
}