fun main(){
    val number = 5
    var result = number in 1..5// this will check wether the given number lies in the series or not
    // it will check in series 1,2,3,4,5 in this case . 5 will also be included.

    println("Method 1(.. dot dot)")
    println(result)
    
    // But if we want to exclude 5 then we will use : 
    result = number in 1 until 5 // series will 1,2,3,4. 5 will be excluded
    println("Method 2 (until)")
    println(result)







}