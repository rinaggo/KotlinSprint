package org.example.lesson_4

fun main(){

    var dayNumber = 5

    val isHandAndPressDay = dayNumber % 2 != 0
    val isLegsAndBackDay = dayNumber % 2 == 0

    var hands = isHandAndPressDay
    var press = isHandAndPressDay
    var back = isLegsAndBackDay
    var legs = isLegsAndBackDay

    println("""
        Упражнение для рук:    $hands
        Упражнение для ног:    $legs
        Упражнение для спины:  $back
        Упражнение для пресса: $press
    """.trimIndent())
}
