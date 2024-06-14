fun main() {
    val x: Any = 20
    when(x){
        2,3,5,7-> println("x es un numero primo entre 1 y 10.")
        in 1..10 -> println("x es un numero entre 1 y 10  pero no es un numero primo.")
        is Int -> println("el numero esta fuera de rango entre 1 y 10")
        else -> println("x no es unnumero primo entre 1 y 10")
    }
}