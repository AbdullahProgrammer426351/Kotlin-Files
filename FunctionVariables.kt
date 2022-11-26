fun main(){
    // println(sum(2.3, 4.0))
    // In kotlin, we can store a function as a variable and also can pass it as arguments in other functions like : 
    // var fn = ::sum// implicitly initializing
    var fn:(a:Double, b:Double) -> Double = ::sum// implicitly initializing

    // using this variable function
    println(fn(2.3, 4.0))

    // calling calculator function(that takes function as parameter)
    calculator(4.5, 1.1, ::sum) 

}

fun sum(a: Double, b:Double):Double{
    return a+b
}

// taking input as a parameter in function

// gn : (Double, Double) -> Double .... taking function as parameter
// '(Double, Double)' --> arguments list
// '-> Double'--> return type
fun calculator(a:Double, b:Double, gn : (Double, Double) -> Double){
    val result = gn(a,b)// using input function in this function
}

