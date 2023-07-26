package lesson3
// урок-3 задача-5

fun main() {
    val info = "D2-D4;0"

    val fromTurn = info.slice(0..1)
    val toTurn = info.slice(3..4)
    val numTurn = info.slice(6..6)

    println(fromTurn)
    println(toTurn)
    print(numTurn)
}
