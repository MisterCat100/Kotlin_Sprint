package lesson5
// урок-5 задача-1

fun main() {
    println("Сколько будет 15 в квадрате?")
    val userAnswer = readln().toInt()
    if (userAnswer == RIGHT_ANSWER) print("Добро пожаловать")
    else print("Доступ запрещен")


}

const val RIGHT_ANSWER = 225