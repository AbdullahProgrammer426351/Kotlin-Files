fun main(){
    // in java, we have to make data classes. These classes are not for special purposes but only store data .These are also called model classes.
    // But in these classes, we have to make getters and setters for every property of that class. But in kotlin, we have to add 'data' keyword in start of that class.
    // kotlin will behind the scenes, do all things himself. And it has also some extra features and functions that are helpful to us. 

    // making object of that class
    val p1 = DataClass(1, "John")

    // 1. copy function: makes a copy object of that class
    var p3 = p1.copy()
    println(p3)

    // we can also change attributes which we want like:
    p3 = p1.copy(id = 5)


    // we can also make destructors with data classes like this:
    val (id, name) = p1
    // this will make 2 variables id and name
    println(id)
    println(name)


    // calling functions like getters
    println(p1.component1())
    println(p1.component2())
    // val (id, name) = p1 is also doing this behind the scenes

}

data class DataClass(val id:Int, val name:String){

}
