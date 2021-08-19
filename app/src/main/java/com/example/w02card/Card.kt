package com.example.w02card

import kotlin.random.Random

enum class Suit
{
    HEARTS, DIAMOND, CLUBS, SPADES
}

enum class Rank
{
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

/*
class Card (var suit: Suit, var rank: Rank){
    var flip: Boolean = true;

    fun flip(){
        //set flip with the opposite of currently
        flip = !flip;
    }

    fun printDetails(){
        if (flip){
            println("Rank: $rank Suit: $suit");
        }else{
            print("------");
        }

    }

}
*/


class Card {
    var flip: Boolean = true
    var suit: Suit
    var rank: Rank

    constructor(fsuit: Suit, frank: Rank) {
        rank = frank
        suit = fsuit
    }

    constructor() : this(
        Suit.values()[Random.nextInt(0, 4)],
        Rank.values()[Random.nextInt(0, 12)]
    ) {

    }

    init {
        suit = Suit.values()[Random.nextInt(0, 4)]
        rank = Rank.values()[Random.nextInt(0, 12)]
    }

    fun flip() {
        //set flip with the opposite of currently
        flip = !flip
    }

    fun getDetails(): String {
        /*
        if (flip){
            println("Suit: $suit Rank: $rank ")
        }else{
            print("------")
        }

        */
        if (flip) return "$suit $rank"
        return "..."

    }


}



