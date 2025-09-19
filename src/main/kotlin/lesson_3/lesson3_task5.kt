package org.example.lesson_3

fun main() {

    val sentMove = "D2-D4;0"
    val parts = sentMove.split("-", ";")
    val fromSquare = parts[0]
    val toSquare = parts[1]
    val moveNumber = parts[2]

    println(fromSquare)
    println(toSquare)
    println(moveNumber)
}