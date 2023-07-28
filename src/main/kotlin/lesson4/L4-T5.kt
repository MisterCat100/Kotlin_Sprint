package lesson4
// урок-4 задача-5

fun main() {
    val isDamaged = readln().toBoolean()
    val staff = readln().toInt()
    val cratesFood = readln().toInt()
    val isNormalWeather = readln().toBoolean()

    print("Корабль может приступить к долгосрочкому плаванию: " +
            "${!isDamaged and (staff in 55 until 70) and (cratesFood > 50)
                    or isDamaged and (staff == 70) and isNormalWeather and (cratesFood > 50)}")

}

