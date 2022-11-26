fun main(){
    // lambda functions are anonymous functions (which has no name)
    val lambda1 = {x:Int, y:Int -> x+y}// one line lambda function
    // 'x:Int, y:Int' --> parameters
    // 'x+y' --> body of function

val singleParameterLambda : (Int) -> Int = {x->x+x}// long form
// val singleParameterLambda : (Int) -> Int = {$it + $it}// short form using $it

    // multiline lambda function
    val multiLineLambda = {
        // the return type of lambda function will be decided by its last line
        // in this case , its last line is some string, so return type of this lambda function will be string
        val a = 3+4
        "Hellow World"
    }
}