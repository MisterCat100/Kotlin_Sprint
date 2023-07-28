package lesson4
// урок-4 задача-1


fun main() {
    println(String.format("Доступность столиков на сегодня: %b\n" +
            "Доступность столиков на завтра: %b", (PLACES != USED_TABLES_TODAY), (PLACES != USED_TABLES_TOMORROW)))
}
const val PLACES = 13
const val USED_TABLES_TODAY = 13
const val USED_TABLES_TOMORROW = 9