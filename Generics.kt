fun main(){
    val obj = IntContainer(3)
    obj.getValue()// return type--> integer

    // making object of generic classes
    val iContainer = Container<Int>(3)// making for integer datatype
    iContainer.getValue()
    val strContainer = Container<String>("Hellow")
    strContainer.getValue()
}

// suppose we have to make multiple classes to perform same operations on specific datatypes, if we use traditional way then, 

// For integer
class IntContainer(var data:Int){
    fun setValue(value : Int){
        data = value
    }

    fun getValue(): Int{
        return data
    }
}

// For String (we will copy same code from IntContainer)
class StringContainer(var data:String){
    fun setValue(value : String){
        data = value
    }

    fun getValue(): String{
        return data
    }
}


// But we have to make separate class for separate datatype, So we make only one class for this purpose with generics like:
class Container<T>(var data:T){
    // T is taken as generic i.e it will be any datatype. We can also write A, B, C... but generally T is used.
    fun setValue(value : T){
        data = value
    }

    fun getValue(): T{
        return data
    }
}