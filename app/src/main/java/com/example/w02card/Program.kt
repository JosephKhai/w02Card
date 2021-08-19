package com.example.w02card


fun main (args: Array<String>) {
    //var ace_heart = Card("HEART", "ACE");
    val ace_heart = Card(Suit.HEARTS, Rank.ACE)
    ace_heart.getDetails()
    ace_heart.flip()
    ace_heart.getDetails()

    println("random")
    val randCard = Card()
    randCard.getDetails()

}