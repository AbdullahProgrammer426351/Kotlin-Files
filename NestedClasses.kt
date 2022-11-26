fun main(){
    val obj = Outer()
    obj.i// accessing properties

    // accessing inner class
    // val nested = Outer.Nested();
    // nested.test()
    // above method is valid when we have not used inner keyword in the start of the child inner class
    // otherwise, we have to make outer class object first and then we can access the inner class like following method:
    val inner  = Outer().Nested()
    inner.test()
}
class Outer{
    var i = 0
    inner class Nested{
        fun test(){
            println("I am nested class $i")
            // $i can be only accessible only if we have used inner keyword in start of child nested class. otherwise , it will give error
        }
    }
}