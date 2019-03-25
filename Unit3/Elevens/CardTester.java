package Elevens;
public class CardTester {
 public static void main(String[] args){
  Card test = new Card("4", "Hearts", 4);
  System.out.println(test);
  System.out.println(test.rank());
  System.out.println(test.suit());
  System.out.println(test.pointValue());
  Card other = new Card("7", "Spades", 7);
  System.out.println(test.matches(other));
  Card yes = new Card("4", "Hearts", 4);
  System.out.println(test.matches(yes));
 }
}
