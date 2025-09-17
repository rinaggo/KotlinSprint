package org.example.lesson_4

fun main() {

    val hasDamage = false
    val crewCount = 68
    val supplyBoxes = 55
    val isWeatherGood = true

    val canSail = (!hasDamage && crewCount >= 55 && crewCount <= 70 && supplyBoxes > 50) ||
            (hasDamage && crewCount == 70 && supplyBoxes >= 50 && isWeatherGood)

    println("Корабль может отплыть: $canSail")

}