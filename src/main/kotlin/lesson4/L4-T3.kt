package lesson4
// урок-4 задача-3

fun main() {
    print(String.format("Благоприятные ли условия сейчас для роста бобовых? %b",
        weatherIsSunny and tentIsOpen and (airWet == 20) and (season != "зима")))

}

const val weatherIsSunny = true
const val tentIsOpen = true
const val airWet = 20
const val season = "зима"
