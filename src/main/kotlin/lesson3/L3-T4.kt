package lesson3
// урок-3 задача-4

fun main() {
    var fromTurn = "E2"
    var toTurn = "E4"
    var turnNum = 1

    println("походили с $fromTurn на $toTurn, номер хода: $turnNum")

    fromTurn = "D2"
    toTurn = "D3"
    turnNum += 1

    println("походили с $fromTurn на $toTurn, номер хода: $turnNum")
}
