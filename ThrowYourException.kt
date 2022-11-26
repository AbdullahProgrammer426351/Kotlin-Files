fun main(){
    createUserList(5)// will be fine
    createUserList(-56)// will throw exception
}

fun createUserList(count : Int){
    if(count < 0){
        throw IllegalArgumentException("Count must be greater than zero")
    }else{
        println("User list created containing $count users")
    }
}