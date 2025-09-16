package org.example.lesson_4

fun main(){

    var dayNumber = 5

    val isHandAndPressDay = dayNumber % 2 != 0

    var hands = isHandAndPressDay
    var press = isHandAndPressDay
    var back = !isHandAndPressDay
    var legs = !isHandAndPressDay

    println("""
        Упражнение для рук:    $hands
        Упражнение для ног:    $legs
        Упражнение для спины:  $back
        Упражнение для пресса: $press
    """.trimIndent())
}
