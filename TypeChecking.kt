fun main(){
    // type checking is a technique that helps us tocheck the datatype of an object. Used to know that wether the object is of a certain class or not. siillar to 'instanceOf' in java

    // with first child class
    val obj:Class1 = Class1()
    performAction(obj)
    
    // with second child class
    val obj2:Class2 =Class2()
    performAction(obj2)
    

}

fun performAction(obj:ParentDemo){
    if(obj is Class1){
        println("object is of Class1")
    }else{
        // smart casting, (like typecasting) and using methods of that class in which class this object is typecasted
        (obj as Class2).meth2()
    }
}

class Class1:ParentDemo(){
    val name = "Class"
}
class Class2:ParentDemo(){
    val name = "Class"
    fun meth2(){
        println("I am meth 2")
    }
}

open class ParentDemo{
    fun callParent(){
        println("Calling parent")
    }
}