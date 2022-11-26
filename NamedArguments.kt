fun main(){
    println(sum(a = 2, b = 4))// Named Arguments technique

    // you can also give value to b first and a later like below
    sum(b = 7, a = 9)
}


/*
Suppose we have to pass many arguments to a function, we have not exact idea that which value will be assinged to which variable in that function, to solve this problem, An approach : NamedArguments is used . accroding to this, we give values to that variables in the function call statements like above:
*/

fun sum(a : Int, b : Int):Int
{
    return a+b
}