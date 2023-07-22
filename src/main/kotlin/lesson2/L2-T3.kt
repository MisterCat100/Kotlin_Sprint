package lesson2
// задача-3 урок-2

fun main() {
    val outTimeHour = 9
    val outTimeMinute = 39
    val outTimeMinuteTotal = outTimeHour * 60 + outTimeMinute
    val lengthTimeMinute = 457

    val inTimeHour = (outTimeMinuteTotal + lengthTimeMinute) / 60
    val inTimeMinute = (outTimeMinuteTotal + lengthTimeMinute) % 60

    print(String.format("%d:%d", inTimeHour, inTimeMinute))

}