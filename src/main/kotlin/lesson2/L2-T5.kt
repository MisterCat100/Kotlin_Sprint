package lesson2

import kotlin.math.pow

// урок-2 задача-5

fun main() {
    val summa = 70_000
    val percentsPerYear = 16.7
    val lengthYear = 20


    val total = summa * ((1 + (percentsPerYear / 100)).pow(lengthYear))

    print(String.format("Ответ: %.3f", total))


}
