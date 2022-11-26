fun main(){
    // if we want to filter data from a data class where, you have to filter only those items where id is equal to 2
    val userList = listOf(
        User(1, "A"),
        User(2, "B"),
        User(3, "C")
    )
    println(userList.filter{it.id == 2})// it will print only those items whose id will 2

}

data class User(val id:Int, val name:String)