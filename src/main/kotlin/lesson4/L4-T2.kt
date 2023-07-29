package lesson4
// урок-4 задача-2

fun main() {
    val m1 = 20
    val v1 = 80
    val m2 = 50
    val v2 = 100

    println(String.format("Первый груз является 'Average': %b\n" +
            "Второй груз является 'Average': %b",
            (m1 >= MIN_WEIGHT) and (m1 <= MAX_WEIGHT) and (v1 < MAX_SIZE),
            (m2 >= MIN_WEIGHT) and (m2 <= MAX_WEIGHT) and (v2 < MAX_SIZE)
        ))

}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_SIZE = 100
