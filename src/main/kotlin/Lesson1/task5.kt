package Lesson1

fun main() {
    var seconds = 6480

    var minutes = (seconds / 60)
    var hours = (minutes / 60)
    val minutesOther = seconds % 60
    val hoursOther = (minutes % 60)
    seconds -= 60 * minutes
    minutes -= 60 * hours


    print(0)
    print(hours)
    print(':')
    print(minutes)
    print(':')
    print(seconds)
    println(0)
}


