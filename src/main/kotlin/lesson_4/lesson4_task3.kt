package org.example.lesson_4

const val EXPECTED_SUNNY = true
const val EXPECTED_AWNING_OPEN = true
const val REQUIRED_HUMIDITY = 20
const val FORBIDDEN_SEASON = "зима"

fun main(){

    val weatherToday = true
    val awningPosition = true
    val airHumidity = 20
    val timeOfTheYear = "зима"

    println("Благоприятные ли сейчас условия для роста бобовых? ${weatherToday == EXPECTED_SUNNY && awningPosition == EXPECTED_AWNING_OPEN && airHumidity == REQUIRED_HUMIDITY && timeOfTheYear != FORBIDDEN_SEASON}")
}