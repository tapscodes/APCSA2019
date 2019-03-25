package Elevens;
import java.util.List;
import java.util.ArrayList;
public class ElevensBoard {
 private static final int BOARD_SIZE = 9;
 private static final String[] RANKS ={"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
 private static final String[] SUITS ={"spades", "hearts", "diamonds", "clubs"};
 private static final int[] POINT_VALUES ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};
 private Card[] cards;
 private Deck deck;
 private static final boolean I_AM_DEBUGGING = false;
 public ElevensBoard(){
  cards = new Card[BOARD_SIZE];
  deck = new Deck(RANKS, SUITS, POINT_VALUES);
  if(I_AM_DEBUGGING){
   System.out.println(deck);
   System.out.println("----------");
  }
  dealMyCards();
 }
 public void newGame(){
  deck.shuffle();
  dealMyCards();
 }
 private void dealMyCards() {
  for (int k = 0; k<cards.length; k++){
   cards[k] = deck.deal();
  }
 }
 public int size(){
  return cards.length;
 }
 public boolean isEmpty(){
  for (int k = 0; k<cards.length; k++) {
   if (cards[k]!=null)
    return false;
  }
  return true;
 }
 public void deal(int k){
  cards[k] = deck.deal();
 }
 public int deckSize(){
  return deck.size();
 }
 public Card cardAt(int k){
  return cards[k];
 }
 public void replaceSelectedCards(List<Integer> selectedCards) {
  for (Integer k : selectedCards) {
   deal(k.intValue());
  }
 }
 public List<Integer> cardIndexes(){
  List<Integer> selected = new ArrayList<Integer>();
  for (int k = 0; k < cards.length; k++){
   if (cards[k] != null)
    selected.add(new Integer(k));
  }
  return selected;
 }
 public String toString(){
  String s = "";
  for (int k = 0; k < cards.length; k++){
   s = s + k + ": " + cards[k] + "\n";
  }
  return s;
 }
 public boolean gameIsWon(){
  if (deck.isEmpty()) {
   for (Card c : cards){
    if (c != null)
     return false;
   }
   return true;
  }
  return false;
 }
 public boolean isLegal(List<Integer> selectedCards){ 
  if(selectedCards.size() == 2){
   return containsPairSum11(selectedCards);
  }
  else if(selectedCards.size() == 3){
   return containsJQK(selectedCards);
  }
  return false;
 }
 public boolean anotherPlayIsPossible(){
  List<Integer> c = cardIndexes();
  return containsPairSum11(c) || containsJQK(c);
 }
 private boolean containsPairSum11(List<Integer> selectedCards){
  for(int i = 0; i < selectedCards.size(); i++){
   for(int j = i+1; j < selectedCards.size(); j++){
    if(selectedCards.get(i)+selectedCards.get(j) == 11)
     return true;
   }
  }
  return false;
 }
 private boolean containsJQK(List<Integer> selectedCards) {
  boolean jack = false;
  boolean queen = false;
  boolean king = false;
  for(Integer card : selectedCards){
   int k = card.intValue();
   if (cardAt(k).rank().equals("jack")) {
    jack = true;
   } else if (cardAt(k).rank().equals("queen")) {
    queen = true;
   } else if (cardAt(k).rank().equals("king")) {
    king = true;
   }
  }
  return jack && queen && king;
 }
}
