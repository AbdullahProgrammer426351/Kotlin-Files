fun main(){
    println(addition(2, 55))
    println(addition(3.55, 9.87))
}

fun addition(a : Int, b: Int): Int
{
    println("Integer sum")
    return a+b
}

fun addition(a : Double, b: Double): Double
{
    println("Double sum")
    return a+b
}