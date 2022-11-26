fun main(){

    // extension functions are used to add functions to built in classes which cannot be extended(for making their child classes to add some more functions).


    // For example,  we have to make a function to formate string in built in String class. we can do this by :
    println("Hellow world".formattedString())
}

fun String.formattedString():String{
    return "-------------\n$this\n--------------------";
}
