package org.example.lesson_3

fun main(){

    var fromSquare = "E2"
    var toSquare = "E4"
    var moveNumber = 1
    var move= "[$fromSquare-$toSquare;$moveNumber]"

    println(move)

    fromSquare = "D2"
    toSquare = "D3"
    moveNumber = 2
    move = "[$fromSquare-$toSquare;$moveNumber]"

    println(move)
}