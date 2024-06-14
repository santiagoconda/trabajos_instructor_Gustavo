fun main() {
    val Actor: String? = "Sandra Oh"

    val lengthOfName = Actor?.length ?: 0

    println("wl numero de caracteres de actor es: $lengthOfName.")
}