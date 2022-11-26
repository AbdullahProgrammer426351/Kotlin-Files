fun main(){
    var obj:Drag = Drag()
    obj.drag()
}

interface Draggable{
    fun drag();
}

class Drag : Draggable{
    override fun drag(){
        println("Draging in drag class")
    }
}