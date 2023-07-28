package lesson4
// урок-4 задача-3

fun main() {
    print(String.format("Благоприятные ли условия сейчас для роста бобовых? %b",
        WEATHER_IS_SUNNY and TENT_IS_OPEN and (AIR_WET == 20) and (SEASON != "зима")))

}

const val WEATHER_IS_SUNNY = true
const val TENT_IS_OPEN = true
const val AIR_WET = 20
const val SEASON = "зима"
