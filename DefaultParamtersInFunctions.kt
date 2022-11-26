fun main() {
    printMessage(5)
    printMessage()// default arguments are recieved
}

// fun printMessage(count:Int){
//     for(i in 1..count){
//         println("Hellow $i")
//     }
// }

// But if we have to define default value of parameters, then we have to write the following code
fun printMessage(count:Int = 2){// it will be given 2 if no parameter is passed, variables taken as parameters are val not var. they cannot be reasigned
    for(i in 1..count){
        println("Hellow $i")
    }
}