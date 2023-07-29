package lesson4
// урок-4 задача-5

fun main() {
    val isDamaged = readln().toBoolean()
    val staff = readln().toInt()
    val cratesFood = readln().toInt()
    val isNormalWeather = readln().toBoolean()

    print("Корабль может приступить к долгосрочкому плаванию: " +
            "${!isDamaged and (staff in MIN_STAFF until MAX_STAFF) and (cratesFood > MIN_CRATES_OF_FOOD)
                    or isDamaged and (staff == MAX_STAFF) and isNormalWeather and (cratesFood > MIN_CRATES_OF_FOOD)}")

}

const val MIN_STAFF = 55
const val MAX_STAFF = 70
const val MIN_CRATES_OF_FOOD = 50

