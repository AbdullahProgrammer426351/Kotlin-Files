fun main(){
    val oneplus = ChildMobile()
    oneplus.display()
}

open class Mobile{
    open fun display() = println("This is parent display")
}

class ChildMobile:Mobile(){
    override fun display(){
        super.display()// to call method of parent class that is overrided
        println("This is child display")
    }
}