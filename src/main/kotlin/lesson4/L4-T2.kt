package lesson4
// урок-4 задача-2

fun main() {
    val m1 = 20
    val v1 = 80
    val m2 = 50
    val v2 = 100

    println(String.format("Первый груз является 'Average': %b\n" +
            "Второй груз является 'Average': %b",
            (m1 >= M_FROM) and (m1 <= M_TO) and (v1 < V_TO),
            (m2 >= M_FROM) and (m2 <= M_TO) and (v2 < V_TO)
        ))

}

const val M_FROM = 35
const val M_TO = 100
const val V_TO = 100
