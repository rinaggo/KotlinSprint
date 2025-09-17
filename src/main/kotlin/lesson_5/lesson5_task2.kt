package org.example.lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2025

fun main() {
    print("Введите год вашего рождения: ")
    val birthYear = readln().toInt()

    val age = CURRENT_YEAR - birthYear

    val resultText = if (age >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else if (age == 16 || age == 17) {
        "Показать ограниченный контент"
    } else {
        "Возврат на главный экран"
    }

    println(resultText)
}
