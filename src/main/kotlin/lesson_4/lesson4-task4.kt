package org.example.lesson_4

fun main(){

    var dayNumber = 5

    val isHandAndPressDay = dayNumber % 2 != 0

    println("""
        Упражнение для рук:    $isHandAndPressDay
        Упражнение для ног:    ${!isHandAndPressDay}
        Упражнение для спины:  ${!isHandAndPressDay}
        Упражнение для пресса: $isHandAndPressDay
    """.trimIndent())
}
