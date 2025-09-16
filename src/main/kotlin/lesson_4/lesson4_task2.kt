package org.example.lesson_4

const val MIN_AVERAGE_WEIGHT = 35
const val MAX_AVERAGE_WEIGHT = 100
const val MAX_AVERAGE_VOLUME = 100

fun main(){

    val firstWeight = 20
    val secondWeight = 50
    val firstVolume = 80
    val secondVolume = 100

    println("Груз с весом $firstWeight кг и объемом $firstVolume л соответствует категории 'Average': ${firstWeight <= MAX_AVERAGE_WEIGHT && firstWeight > MIN_AVERAGE_WEIGHT && firstVolume < MAX_AVERAGE_VOLUME} ")
    println("Груз с весом $secondWeight кг и объемом $secondVolume л соответствует категории 'Average': ${secondWeight <= MAX_AVERAGE_WEIGHT && secondWeight > MIN_AVERAGE_WEIGHT && secondVolume < MAX_AVERAGE_VOLUME} ")
}