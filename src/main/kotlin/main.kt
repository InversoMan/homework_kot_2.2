fun main() {
    val likes = 5121
    val result: String = if (likes % 10 == 1 && likes % 100 != 11 && likes != 11) "человеку." else "людям."
    println("Понравилось $likes $result")
}