import java.util.Scanner;
import java.lang.Math;
public class MovieRatingsPudell
{  
  public static void main(String[] args){
      //variables  
      //web reviews
      int r1;
      int r2;
      int r3;
      //focus group reviews
      double r4;
      double r5;
      //critic review
      double r6;
      //averages
      double web;
      double focus;
      double total;
      //code begins
      Scanner s = new Scanner(System.in);
      //web reviews
      System.out.println("Please enter ratings from the movie review website.");
      r1=s.nextInt();
      r2=s.nextInt();
      r3=s.nextInt();
      web = ((double)(r1+r2+r3))/3;
      //focus group reviews
      System.out.println("Please enter ratings from the focus group.");
      r4=s.nextDouble();
      r5=s.nextDouble();
      focus = (r4+r5)/2;
      //critic review
      System.out.println("Please enter the average movie critic rating.");
      r6=s.nextDouble();
      //prints out results
      System.out.println("Average website rating: "+web);
      System.out.println("Average focus group rating: "+focus);
      System.out.println("Average movie critic rating: "+r6);
      //calculates+prints total avg across all sources
      total = (2*web+3*focus+5*r6)/10;
      System.out.println("Overall movie rating: " + total);
    }
}