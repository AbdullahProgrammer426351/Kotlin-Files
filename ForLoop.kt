fun main(){
    // below code is automatically incrementing value of i.
    println("Code with automatic increment")
    for(i in 1..5){
        println(i)
    }

    // below code will increment by 2 not one. This is helpful when we want to increment value according to our need instead of 1
    println("Code with step increment")
    for(i in 1..5 step 2){// this will add increment of 2
        println(i)
    }


    println("loop with until")
    for(i in 1 until 5){// 5 will not included 
        println(i)
    }


    println("reverse loop with decrement")
    for(i in 10 downTo 1){// this will decrement value of i. we can also use step in it to decrement value according to our need
        println(i)
    }


    println("Table with for loop")
    val num = 2
    for(i in 1..10){
        // println(num.toString() + " x " + i + " = " + (num * i))--> but this can be achieved in easy way. This way is called String templating 
        println("$num x $i = ${num * i}")
    }
    
}