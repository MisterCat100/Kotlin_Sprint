package lesson4
// урок-4 задача-1


fun main() {
    println(String.format("Доступность столиков на сегодня: %b\n" +
            "Доступность столиков на завтра: %b", (places != usedTablesToday), (places != usedTablesTomorrow)))
}
const val places = 13
const val usedTablesToday = 13
const val usedTablesTomorrow = 13 - 4