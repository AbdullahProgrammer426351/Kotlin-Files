fun main(){
    // In enum class, we played with values. But in sealed classes , we will play with state or type
    val tile = Red("Mushroom", 25)
    val tile2 = Red("Fire", 30)
    println("${tile.points} - ${tile.type}")
}

sealed class Tile
// in this case, Tile class is an abstract class
class Red(val type:String, val points:Int):Tile()
class Blue(val points:Int):Tile()