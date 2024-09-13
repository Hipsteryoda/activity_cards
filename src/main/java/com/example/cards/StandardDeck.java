package com.example.cards;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StandardDeck implements Deck {
  
  List<Card> cards;

  public StandardDeck() {
    this.cards = newDeck();
  }

  private List<Card> newDeck() {
    List<Card> newDeck = new ArrayList<>();
                                              //vv Arrow Operator
    Arrays.stream(Suit.values()).forEach(suit -> {

      Arrays.stream(FaceValue.values())
        .map(faceValue -> new Card(suit, faceValue))
        .forEach(newDeck::add);

    });

    return newDeck;
  }

  @Override
  public void cut(int position) {
    return;
  }

  @Override
  public Card deal() {
    return null;
  }

  @Override
  public void newOrder(Deck deck) {
    return;
  }

  @Override
  public int search(Card card) {
    return 0;
  }

  @Override
  public void shuffle() {
    Collections.shuffle(this.cards, new Random(System.nanoTime()));
  }
  
  @Override
  public int size() {
    return 0;
  }

  @Override
  public Card turnOver() {
    return null;
  }

  @Override
  public String toString() {
    return null;
  }
}
