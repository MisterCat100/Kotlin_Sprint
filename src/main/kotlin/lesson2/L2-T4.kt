package lesson2
// урок-2 задача-4

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 0.2

    val bonusCrystalOre = crystalOre * buff
    val bonusIronOre = ironOre * buff

    println(String.format("Кристальная руда: %.0f", bonusCrystalOre))
    print(String.format("Железная руда: %.0f", bonusIronOre))


}