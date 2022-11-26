fun main(){
    /*
    major d/w array and list is that array has fixed size while list has nnot fixed size. List is flexible than arrays
    Lists are of 2 types:
    1. mutable -can be changed
    2. immutable - cannot be changed(insertion, deletion, update is not allowed)
    d/w array and immutable list is that in array, we can change value but in immutable, we cannot even change data.
    */

    
    // 1. Immutable list
    // like arrayOf() for arrays, listOf() is used for immutable List
    val nums = listOf(1,2,3)

    // operations with List
    nums.indexOf(3)
    nums.contains(2)
    // nums.add()--> there is no method like this because of immutable
    println("Immutable : " + nums)


    // 2. Mutable list
    // like arrayOf() for arrays, mutableListOf() is used for mutale List
    val num = mutableListOf(1,2,3)

    num.add(33)// allowed because of mutable list
    num.add(1)// allowed because of mutable list
    println("Mutable : " + num)



    var l2 = listOf(44,55,66)
    num.addAll(l2)

    println("Mutable list after adding collection : " + num)
    
}