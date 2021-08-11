package com.example.w02card

class Card {
    val rank: String = ""
    val suit: String = ""
    val flip: Boolean = true



    fun flip(){
       if (flip){
           printDetails()
       }else{
           print("------")
       }
    }
    fun printDetails(){
        println("rank: $rank suit: $suit")
    }

}