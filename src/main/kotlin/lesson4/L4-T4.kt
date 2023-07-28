package lesson4
// урок-4 задача-4

fun main() {
    println("""
        Упражнения для рук:    ${TRAINING_DAY % 2 == HANDS_BODY_INDEX}
        Упражнения для ног:    ${TRAINING_DAY % 2 == HANDS_BODY_INDEX}
        Упражнения для спины:  ${TRAINING_DAY % 2 == LEGS_SPINE_INDEX}
        Упражнения для пресса: ${TRAINING_DAY % 2 == LEGS_SPINE_INDEX}
    """.trimMargin())

}

const val TRAINING_DAY = 5
const val HANDS_BODY_INDEX = 0
const val LEGS_SPINE_INDEX = 1

