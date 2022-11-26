fun main(){
    // like list, there are two types of Maps : 1. mutable 2. Immutable

    // Important notes:
    // 1. keys should be unique
    // 2. if you are fetching value from index that does not exist, it will return null

    // mutable map
    println("Mutable map")
    val students = mutableMapOf<Int, String>()
    // adding value
    students.put(1, "Stu 1")
    students.put(2, "Stu 2")
    students.put(3, "Stu 3")
    students[4]// method 2

    // getting value
    println("Value at index 1 : " + students.get(1))
    students[1]// method 2


    // looping in map
    println("Looping in map")
    for((key, value) in students){
        println("$key = $value")
    }



    // immutable map
    println("Immutable map")
    val map = mapOf<Int, String>(1 to "first value", 2 to "second value", 3 to "Third value")
    println(map)

}