fun main(){
    // accessing object that is within the class
    println("Without direct access")
    MyClass.MyObject.f()
    // but we want that we have not to go to class and furthur go to object and then method of that object. We want that we have to access direct method of object of that class. like --> MyClass.f(). To do this, we have to use companion keyword with that object.
    println("With direct access")
    MyClass.f()
}

class MyClass{
    // object MyObject{
        @JvmStatic
    companion object MyObject{
        fun f(){
            println("Hellow I am F from Object")
        }
    }

    // There can be only one companion in one class


    // Note : we use companion in kotlin to fulfill the need of static. because static keyword is used in java not kotlin. But if we have to use this method as static with java, we have to tell the compiler that this method should behave as static method when it will be called by java. For this we add @JvmStatic annotation on the top of that method which we want to be static in java class like above method
}