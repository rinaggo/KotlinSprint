package org.example.lesson_3

fun main() {

    val sentMove = "D2-D4;0"
    val parts = sentMove.split(";")
    val moveNumber = parts[1]
    val squares = parts[0].split("-")
    val fromSquare = squares[0]
    val toSquare = squares[1]

    println(fromSquare)
    println(toSquare)
    println(moveNumber)
}