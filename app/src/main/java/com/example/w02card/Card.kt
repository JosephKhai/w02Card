package com.example.w02card

class Card {
    val rank: String = "card name1"
    val suit: String = "card name2"
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