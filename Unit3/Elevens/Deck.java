package Elevens;
import java.util.List;
import java.util.ArrayList;
public class Deck{
 private List<Card> cards;
 private int size;
 public Deck(String[] ranks, String[] suits, int[] values) {
  cards = new ArrayList<Card>();
  for(int j = 0; j < ranks.length; j++){
   for(String suitString:suits){
    cards.add(new Card(ranks[j], suitString, values[j]));
   }
  }
  size = cards.size();
  shuffle();
 }
 public boolean isEmpty() {
  return size==0;
 }
 public int size(){
  return size;
 }
 public void shuffle(){
  ArrayList<Card> tr = new ArrayList<Card>();
  while(cards.size()>0){
   int pos=(int)(Math.random()*(cards.size()+1));
   tr.add(cards.get(pos));
   cards.remove(pos);
  }
  cards = tr;
  size = cards.size();
 }
 public Card deal() {
  if(isEmpty())
   return null;
  size--;
  Card c = cards.get(size);
  return c;
 }
 @Override
 public String toString(){
  String rtn = "size = "+size+"\nUndealt cards: \n";
  for(int k = size-1; k>=0; k--){
   rtn+=cards.get(k);
   if(k!=0)
    rtn+=", ";
   if((size-k)%2==0)
    rtn+="\n";
  }
  rtn+="\nDealt cards: \n";
  for(int k = cards.size()-1; k>=size; k--){
   rtn+=cards.get(k);
   if(k!=size)
    rtn+=", ";
   if((k-cards.size())%2==0)
    rtn+="\n";
  }
  rtn+="\n";
  return rtn;
 }
}
