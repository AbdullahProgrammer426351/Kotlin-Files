fun main(){
    // we can also make anonymous objects(ie objects without any name like below)
    var testObj = object {
        val x : Int = 10
        fun method(){
            println("I am object declaration")
        }
    }
    // This is called object declaration
    println(testObj.method())


    // making anonymous object that inherits interface. Same like this, we can also make anonymous objects that inherits classes
    var obj = object : Cloneable{
        override fun clone(){
            println("I am clone")
        }
    }
    obj.clone()
}

// we can also make anonymous objects inheriting interfaces.
interface Cloneable{
    fun clone()
}