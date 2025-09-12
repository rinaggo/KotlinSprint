package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main(){

    val departureHour= 9
    val departureMinute = 39
    val travelTimeMinutes = 457
    val departureTimeMinutes = departureHour * MINUTES_IN_HOUR + departureMinute

    val arrivalTimeMinutes = travelTimeMinutes + departureTimeMinutes

    val arrivalHours = arrivalTimeMinutes / MINUTES_IN_HOUR
    val arrivalMinutes = arrivalTimeMinutes % MINUTES_IN_HOUR

    print(arrivalHours)
    print(":")
    print(arrivalMinutes)
}