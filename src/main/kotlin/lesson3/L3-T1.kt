package lesson3
// урок-3 задача-1

fun main() {
    var greetingsDay = "Добрый день, "
    var greetingsEvening = "Добрый вечер, "
    val user = "уважаемый клиент!"

    greetingsDay += user
    greetingsEvening += user

    println(greetingsDay)
    print(greetingsEvening)
}
