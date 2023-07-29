package lesson5
// урок-2 задача-3

fun main() {
    println("Назовите первое число от 1 до 100")
    val firstAnswer = readln().toInt()
    println("Назовите второе число от 1 до 100")
    val secondAnswer = readln().toInt()

    if ((firstAnswer == 72) and (secondAnswer == 36) or (firstAnswer == 36) and (secondAnswer == 72)) {
        print("Поздравляем! Вы выиграли главный приз!")
    }
    else if ((firstAnswer == 72) and (secondAnswer != 36) or (firstAnswer == 36) and (secondAnswer != 72)) {
        print("Вы выиграли утешительный приз!")
    }
    else print("Неудача! Крутите барабан")
}

const val FIRST_NUM = 72
const val SECOND_NUM = 36