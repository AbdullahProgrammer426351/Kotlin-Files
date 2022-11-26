fun main(){
    val ob = Calculator()
    println(ob.add(2, 4))
}

class Calculator{

    // making peroperties of calculator class

    
    // var message:String --> not allowed here
    /*
    NOTE : we cannot declare variables in kotlin like other languages. Because declaration causes runtime errors and objective of kotlin is to avoid runtime errors. If we have to declare variables and to not initialize variables. we add a keyword 'lateinit' like below code:
    */

    lateinit var message:String// ---> allowed(But it must be var type not val. And these properties cannot be int, float or boolean)

    fun add(a : Int, b : Int): Int{
        return a+b
    }
    
    fun multiply(a : Int, b : Int): Int{
        return a*b
    }
}