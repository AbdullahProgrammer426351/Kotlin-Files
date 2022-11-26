fun main(){
    // map function is used to perform some specific function with elements of a list. like in this example, we will take square of each element in the list and will store their squares into a new list.
    // In simple words, it is used to convert list form one form to another form
    val nums = listOf(1,2,3,4,5)
    val list = nums.map{it * it}
    println(list)
}