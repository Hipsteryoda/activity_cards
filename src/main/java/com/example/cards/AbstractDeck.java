package com.example.cards;

import java.util.List;

public abstract class AbstractDeck implements Deck {

  protected List<Card> cards;

  public void cut(int position) {
    return;
  }

  public Card deal() {
    return null;
  }

  public void newOrder(Deck deck) {
    return;
  }

  public int search(Card card) {
    return 0;
  }

  public void shuffle() {
    return;
  }

  public int size() {
    return 0;
  }

  public Card turnOver() {
    return null;
  }

}
