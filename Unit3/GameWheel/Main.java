package GameWheel;
import java.util.*;
public class Main {
  public static void main (String[] args) {
   GameWheel p1 = new GameWheel();
   GameWheel p2 = new GameWheel();
   ArrayList<PrizeCard> p1Spins = new ArrayList<PrizeCard>();
   ArrayList<PrizeCard> p2Spins = new ArrayList<PrizeCard>();
   int p1Total=0;
   int p2Total=0;
   int x=0;
   //Player 1 Spins 5 Times
   p1Spins.add(p1.spinWheel());
   p1Total+=p1Spins.get(0).getPrizeAmount();
   //^1st Spin
   //Does next 4 spins, but makes sure they aren't the same as others
   while(x<4){
    boolean equal=false;
    PrizeCard a=p1.spinWheel(); 
    for(int i=0; i<p1Spins.size(); i++)
     if(a.getID()==p1Spins.get(i).getID())
      equal=true;
    if(!equal){
     p1Spins.add(a);
     p1Total+=a.getPrizeAmount();
     //counter goes up
     x++;
    }
   }
   //Player 2 Spins 5 Times(exact same as p1)
   p2Spins.add(p2.spinWheel());
   p2Total+=p2Spins.get(0).getPrizeAmount();
   x=0;
   //^1st Spin
   //Does next 4 spins, but makes sure they aren't the same as others
   while(x<4){
    boolean equal2=false;
    PrizeCard a=p2.spinWheel(); 
    for(int i=0; i<p2Spins.size(); i++)
     if(a.getID()==p2Spins.get(i).getID())
      equal2=true;
    if(!equal2){
     p2Spins.add(a);
     p2Total+=a.getPrizeAmount();
     //counter goes up
     x++;
    }
   }
   //Declares Totals+Winner
   System.out.println("Player 1 Total: $"+p1Total);
   for(int i=0; i<p1Spins.size(); i++){
     System.out.println(p1Spins.get(i));
   }
   System.out.println("\nPlayer 2 Total: $"+p2Total);
   for(int i=0; i<p2Spins.size(); i++){
     System.out.println(p2Spins.get(i));
   }
   if(p1Total>p2Total){
    int d=p1Total-p2Total;
    System.out.println("\nPlayer 1 won by $"+d+"!");
   }
   else if(p2Total>p1Total){
    int d=p2Total-p1Total;
    System.out.println("\nPlayer 2 won by $"+d+"!");
   }
   else
    System.out.println("\nIt's a tie!");
  }
}
