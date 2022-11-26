fun main(){
    val result = add(3, 6)
    println(result)
    
}

// fun add(num1:Int, num2:Int):Int ---> Int (at last) is return datatype
// fun add(num1:Int, num2:Int):Int
// {
//     val sum = num1 + num2
//     return sum
// }


// we can also make one line functions . For example, we can make above add function as given bellow

// fun add(num1:Int, num2:Int):Int = num1 + num2// --> inline function
fun add(num1:Int, num2:Int) = num1 + num2// --> inline function(more short line). By removing return type, we can also make inline functions 

// the default return type of function in kotlin is Unit (like void in other languages)