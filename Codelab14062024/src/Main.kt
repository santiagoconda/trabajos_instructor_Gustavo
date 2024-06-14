fun main() {
    val color2="yelow"
    if (color2=="red"){
        println("Stop")
    }else if (color2=="yellow"){
        println("slow")
    }else if (color2=="green"){
        println("goo!")
    }else{
        println("color invalido")
    }

        val color1 = "Red"

        val message = when(color1) {
            "Red" -> "Stop"
            "Yellow", "Amber" -> "proceda con precaucion"
            "Green" -> "Go"
            else -> "color invalido"
        }
        println(message)

}
