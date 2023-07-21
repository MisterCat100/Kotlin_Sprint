package lesson1
// task_5

fun main() {
    var seconds = 6480

    var minutes = (seconds / 60)
    var hours = (minutes / 60)
    val minutesOther = seconds % 60
    val hoursOther = (minutes % 60)
    seconds -= 60 * minutes
    minutes -= 60 * hours

    val answer = String.format("0%d:%d:%d0", hours, minutes, seconds)
    println(answer)
}


