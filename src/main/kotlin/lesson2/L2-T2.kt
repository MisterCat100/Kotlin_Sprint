package lesson2

fun main() {
    val staff = 50
    val staffPayment = 30000
    val intern = 30
    val internPaymenet = 20000

    val allStaffPayment = staff * staffPayment
    val allInternPayment = intern * internPaymenet
    val middlePayment = (allInternPayment + allStaffPayment) / staff + intern

    println(allStaffPayment)
    println(allInternPayment)
    print(middlePayment)


}