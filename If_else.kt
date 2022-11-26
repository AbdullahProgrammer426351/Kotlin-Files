fun main(){
    val isRaining = true;

    if(isRaining){
        println("Take Umbrella")
    }else{
        println("No raining - Enjoy your day")
    }


    // using if-else as expressions
    val x = 50
    val result = if(x>50){
        "X is greater than 50"
    }else if(x == 50){
        "X is equal to 50"
    }else{
        "X is smaller than 50"
    }
    println(result)
}