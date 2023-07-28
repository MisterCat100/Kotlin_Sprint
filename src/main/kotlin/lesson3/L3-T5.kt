package lesson3
// урок-3 задача-5

fun main() {
    val info = "D2-D4;0"

    val parts = info.split("-", ";")
    val fromTurn = parts[0]
    val toTurn = parts[1]
    val numTurn = parts[2]

    println(fromTurn)
    println(toTurn)
    print(numTurn)
}
