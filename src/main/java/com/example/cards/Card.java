package com.example.cards;

/**
 * Card
 */
public class Card implements Comparable<Card> {

  private Suit suit;
  private FaceValue faceValue;

  // blocks the default constructor
  // ensures that the overloaded constructor is used
  private Card() {
    return;
  }

  public Card(Suit suit, FaceValue value) {
    this.suit = suit;
    this.faceValue = value;
  }

  public int compareTo(Card otherCard) {
    return 0;
  }

  public boolean equals(Object obj) {
    return false;
  }

  public Suit getSuit() {
    return this.suit;
  }

  public FaceValue getValue() {
    return this.faceValue;
  }

  public int hashCode() {
    return 0;
  }
  //
  //public void setSuit(Suit suit) {
  //  this.suit = suit;
  //}
  //
  //public void setValue(FaceValue value) {
  //  this.value = faceValue;
  //}
  //
  public String toString() {
    return this.faceValue + " of " + this.suit;
  }

}

