fun main(){
    val nums = listOf(1, 2, 3, 4, 5)
    println(isOdd(3))// returns true because 3 is odd
    println(isOdd(2))// returns false because 2 is even


    // (1) filter function
    var list = nums.filter(::isOdd)
    // this will traversal the whole list and will add values to list that it is returning if function value will be true. In this way we can apply our custom filter on list. Lets check by taking output of this list:
    println(list)
    // you can also pass direct method like:
    list = nums.filter(fun(a:Int):Boolean{
        return a % 2 != 0
    })
    // we can also use lambda like : 
    list = nums.filter({a:Int->a%2!=0})
    // more simplified
    list = nums.filter{a:Int->a%2!=0}
    // more simplified (using it)
    list = nums.filter{it % 2 != 0}

}

fun isOdd(a : Int):Boolean{
    // this function is used to filter only odd numbers from list
    return a % 2 != 0
}