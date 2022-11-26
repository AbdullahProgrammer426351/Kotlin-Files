fun main(){
    val animal = "Dog"
    // if(animal == "Horse"){
    //     println("Animal is horse")
    // }else if(animal == "Cat"){
    //     println("Animal is Cat")
    // }else if(animal == "Dog"){
    //     println("Animal is Dog")
    // }else{
    //     println("Animal not found")
    // }


    // Above method is a traditional way . But we will use 'when' instead of using else-if like below:
    // This is like switch statement. We can also use it as expression

    when(animal){
        "Horse" -> println("Animal is Horse")
        "Cat" -> println("Animal is Cat")
        "Dog" -> println("Animal is Dog")
        else -> println("Animal not found")
    }


}