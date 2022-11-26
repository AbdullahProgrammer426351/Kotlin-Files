fun main(){
    var arr = arrayOf("One", "Two", "Three")
    var arr1 = arrayOf(1, 2, 3)

    var arr2 = arrayOf<Int>(3, 5, 6)// specifying datatype 

    // to print array
    println("Array values : ")
    for(i in arr){
        println(i)
    }


    // to print array along with index no
    println("To print array values along with index numbers")
    for((i, e) in arr.withIndex()){
        println("$i - $e")
    }



    // setting value in array
    arr[0] = "Hellow" // first method
    arr.set(1, "Index 1")// second method where 1 is index no and "Index 1" is value to be setted in that index

}