package org.example.lesson_4

fun main(){

    val weatherToday = true
    val awningPosition = true
    val airHumidity = 20
    val timeOfTheYear = "зима"

    println("Благоприятные ли сейчас условия для роста бобовых? ${weatherToday && awningPosition && airHumidity == 20 && timeOfTheYear != "зима"}")
}