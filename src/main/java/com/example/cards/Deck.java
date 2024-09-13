package  com.example.cards;

public interface Deck {

  // where do we want to cut the deck?
  // at what number?
  void cut(int index);

  Card deal();

  void newOrder(Deck cards);

  // returnd the index of the card
  int search(Card card);

  void shuffle();

  int size();

  Card turnOver();

}
