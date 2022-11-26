fun main(){
    // suppose we want to assign value to a variable in class. But we want  to assign value form a set of values only like we want to assign a value to day variable, there must be values only Monday, Tuesday and so on to sunday. Any other value does not makes sense. or in gender case, male, female and others are meaningful. Other strings does not make any sense. For this restriction, we use Enum classes.

    println("With constructor")
    val day = Day.SATURDAY
    println(day)
    // with constructor
    println("Without constructor")
    val day2 = DayWithConstructor.SATURDAY
    println(day2)
    println("Day number : " + day2.number)


    println("Looping in enum class")
    for(i in Day.values()){
        println(i)
    }

    // calling method from enum class
    day2.printFormattedDay()

}
enum class Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

// enum classes with cocnstructors
enum class DayWithConstructor(val number:Int){
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    // making methods in enum class. For this , we have to add ';' to last property of enum class
    fun printFormattedDay(){
        println("The day is $this")
    }
}