fun main(){
    // we can pass multiple values using varArgs
    add(1,2,3)
    add(1,2,3,4,4,5)
}
fun add(vararg values: Int){
    var sum = 0
    for(i in values){
        sum += i
    }
    println(sum)
}