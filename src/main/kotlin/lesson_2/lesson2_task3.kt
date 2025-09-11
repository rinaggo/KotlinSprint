package org.example.lesson_2

fun main(){

    val travelTimeMinutes = 457
    val departureTimeMinutes = 9 * 60 + 39

    val arrivalTimeMinutes = travelTimeMinutes + departureTimeMinutes

    val arrivalHours = arrivalTimeMinutes / 60
    val arrivalMinutes = arrivalTimeMinutes % 60

    print(arrivalHours)
    print(":")
    print(arrivalMinutes)
}