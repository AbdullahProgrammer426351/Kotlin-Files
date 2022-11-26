fun main(){
    val userList = listOf(
        NewUser(1, "A"),
        NewUser(2, "B"),
        NewUser(3, "C")
    )

    // we have to change the values of NewUser datatype into PaidUuser datatype, we can do this using map function. like this:
    val paidUserList = userList.map{
        PaidUser(it.id, it.name, "Paid")
    }
    // the datatype is convnerted from NewUser to PaidUser
    println(paidUserList)
}
data class NewUser(val id:Int, val name:String)
data class PaidUser(val id:Int, val name:String, val type:String)