fun main(){
    // Inn kotlin, we cannot assign null value to a variable. It is due to avoid null pointer exception. If we want to assign null value to a variable, we have to write code like this:
    var gender: String? = null
    // adding ? will allow us to assing null value. This will help us when we will use this variable in our code, it will aware us bu giving error

    // method to handle null values

    // 1. if-else statement(we will check by if condition whether the variable is null or not)
    if(gender != null)
        println(gender.toString())
    else
        println("Null value")


    // 2. safe-call operator (?) (this operator will check value is null or not)
    println(gender?.toString())


    //3. let - for handling multiple statements, because above methods help us only for one line. And it is not good to use above methods for every line. for this let operator is used
    gender?.let{
        println("line 1")
        println("line 2 - $gender")
        // in let portion, we can also access gender variable by using $it like in below line
        println("line 3 - $it")
    }


    // now suppose we want to assign this variable's value to a new variable. We want that if variable is null, some default value should be given, otherwise value from variable should be  given. To do this, we will write code like below
    var selectedValue = gender?:"NA"
    // it will assign value 'NA' if value will be null


    // 3. assert not null operator - this will run code in both conditions, it is helpful when you are sure that variable value will not be null or you want error in case of null exception. Otherwise this should not be used. This is used when code must be executed. See the code

    // var value =  gender!!.toString()// this will throw exception. so I am commenting this

    
}