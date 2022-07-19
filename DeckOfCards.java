import java.util.Random;
public class DeckOfCards
{
  private Card deck[]; // array of card objects 
  private int currentcard; // index of next card to be dealt 
  private final int NUMBER_OF_CARDS = 52;
  private Random randomNumbers;  // random number generator 
 // contsructor fills deck of Cards 
  public DeckOfCards()
  {
    String faces[] = {"Ace", "deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String suits[] = {"Hearts", "Diamonds" , "Clubs", "Spades"};
    // creating the array for deck of cards 
    deck = new Card[NUMBER_OF_CARDS];
    currentCard = 0; // set currentCartd so first card deal is deck{0}
    randomNumbers = new Random(); // create ranndom numbner generateor
    // populate the deck with card objects 
    for ( int count = 0; count < deck.length; count ++)
      deck[count] = new Card( faces[ count % 13],suits[count/13]);
  }
  public void shuffle()
  {
    // shuyffling deck of cards with one-pass algoriuthm
    currentCard = 0;
    
    for ( int first = 0; first < deck.length;first++)
    {
      int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
      
      Card temp = deck[first];
      deck [first]  = deck[second];
      deck[second]=temp;
  }
}
  
  public Card dealCard()
  {
    if(currentCard<deck.length)
      return deck[currentCard++];
    else
      return null;
  }
}
