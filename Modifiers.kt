fun main(){
    val obj:A = A()
    println(obj.p)// accessible (public)
    // println(obj.q)// not accessible (private)
    println(obj.r)// accessible (internal)
    // println(obj.s)// not accessible (protected). Because protected are available in only subclasses 
}


// by default, all classes, functions and properties are public 
// For testing, TestModifiers.kt file is made
// 1. public --> it can be accessible from everywhere within the package
// 2. internal ---> can be accesible from everywhere but witin a module
// 3. private ---> can be accessible from within the class only
// 4. protected ---> can be accessible within the class or sub classes
open class A{
    public var p = 10
    private var q = 20
    internal var r = 30
    protected var s = 40
}

class B:A(){
    fun test(){
        println(p)
        // println(q) --> not allowed because private can only accessible within the class
        println(r)
        println(s)
    }
}