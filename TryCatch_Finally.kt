fun main(){
    val arr = arrayOf(1,23,3)
    try{
        println(arr[5])
    }
    catch(e:IndexOutOfBoundsException){
        println("Out of bound")
        println("Error : " + e.message)
    }
    catch(e:Exception){
        println("Other exception")
        println("Error : " + e.message)
    }
    finally{
        println("Finnaly code running")
    }
}