fun main(){
    val oneplus = OnePlus("One Plus type")
    oneplus.display()
    val generalMobile = Mobile("Simple type")
    generalMobile.display()
}

open class Mobile(val type:String){
    // if we want to allow to override any method or property, we have to add open keyword simply 
    open val name:String = ""
    val size : Int = 5
    fun makeCall() = println("Callng from mobile")
    fun powerOff() = println("Sutting down")
    open fun display() = println("Simple mobile display")
}

class OnePlus(typeParam:String):Mobile(typeParam){
    // when we are overriding function, we have to add override keyword when initializing it.
    override val name : String = "One Plus"
    override fun display() = println("One plus display")
}