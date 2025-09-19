package org.example.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_FOOD_BOXES = 50
const val FULL_CREW = 70

const val NO_DAMAGE = false
const val GOOD_WEATHER = true

fun main() {
    val hasDamage = false
    val crewSize = 70
    val foodBoxes = 60
    val isWeatherGood = true

    val canSail =
        (hasDamage == NO_DAMAGE && crewSize >= MIN_CREW && crewSize <= MAX_CREW && foodBoxes > MIN_FOOD_BOXES) || (hasDamage != NO_DAMAGE && crewSize == FULL_CREW && isWeatherGood == GOOD_WEATHER && foodBoxes >= MIN_FOOD_BOXES)

    println("Корабль может отплыть: $canSail")

}