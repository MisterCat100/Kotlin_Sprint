package lesson2
// урок-2 задача-3

fun main() {
    val outTimeMinuteTotal = 9 * 60 + 39
    val lengthTimeMinute = 457

    val inTimeHour = (outTimeMinuteTotal + lengthTimeMinute) / 60
    val inTimeMinute = (outTimeMinuteTotal + lengthTimeMinute) % 60

    print(String.format("%d:%d", inTimeHour, inTimeMinute))

}