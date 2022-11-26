fun main(){
    val emp:EE = EE()
    // when we used let function, we used it variable inside it and we have to write on every line 'it'. But we can avoid this using with():

    with(emp){
        // this will give a reference 'this'. not we can do the same things without writing it operator. Like
        age = 30
        name = "qqq"


        // its return value will be its last value as same as let.
    }
}
data class EE(var name:String = "ddd", var age:Int = 33)