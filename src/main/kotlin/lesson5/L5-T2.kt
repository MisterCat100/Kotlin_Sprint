package lesson5
// урок-5 задача-2

fun main() {
    val userBirthYear = readln()!!.toInt()
    val userAge = CURRENT_YEAR - userBirthYear
    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else if (userAge in 16 .. 17) println("Показать экран с ограниченным контентом")
    else println("Вернуться на главный экран")

}

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2023