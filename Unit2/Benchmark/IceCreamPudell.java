package Benchmark;
import java.util.ArrayList;
public class IceCreamPudell{
 //declares all variables used
 public String flavor;
 public int scoops;
 ArrayList<String> toppings=new ArrayList<String>();
 public boolean cone;
 public double price;
 public static double SCOOP_PRICE=.6;
 public String print="";
 public String print2;
 public String extra;
 //checks if there are no toppings(sundae)
 public boolean clearToppings=false;
 //sets default values indicated in prompt
 public IceCreamPudell(){
  this("vanilla", 1, false);
 }
 //main constructor, if scoops<1 it makes scoops 1, otherwise works as intended
 public IceCreamPudell(String f, int s, boolean c){
  flavor=f;
  if (s<1)
   scoops=1;
  else
   scoops=s;
  cone=c;
 }
 //adds topping to toppings arraylist
 public void addTopping(String t){
  toppings.add(t);
 }
 //returns flavor
 public String getFlavor(){
  return flavor;    
 }
 //returns price
 public double getPrice(){
  return price;    
 }
 //finds the price by doing scoops*.6
 public void calcPrice(){
  price=scoops*SCOOP_PRICE; 
 }
 //adds scoops to the current amount of scoops
 public void addScoops(int n){
  scoops+=n;
 }
 //method combining two flavors to one as indicated in prompt
  public String sundae(IceCreamPudell a, IceCreamPudell b){
  flavor=a.flavor+"-"+b.flavor;  
  cone=false;
  scoops=2;
  clearToppings=true;
  //(attempts to)removes all toppings^
  return flavor;
 }
 //method made to print the arraylist
 public void toPrint(){
  //prints toppings correctly
  if(toppings.size()<1 || clearToppings){
   print="None";
   clearToppings=false;
  }
  else{//for loops prints each item then a new line, the 10 spaces to allign
   for(int i=0;i<toppings.size()-1;i++){
    print+=toppings.get(i)+"\n          ";  
   }//                        12345678910
   //adds final item to print so there is no extra \n
   print+=toppings.get(toppings.size()-1);
  }
  //sets proper print based on cone's value
  if(!cone)
   print2="NO";
  else
   print2="YES";
  //EXTRA CREDIT: Works!
  extra="           _\n"+
  "          //\n"+
  "   ,O.   //\n"+
  " ,(:::)=//\n"+
  "(  `~(###)\n"+
  " %---'`\"y\n"+
  "  \\    /\n"+
  "   \\  /\n"+
  "  __)(__\n"+
  " '------`";
 }    
 //prints everything as indicated after calculating price and setting print
 public String toString(){
  calcPrice();
  toPrint();
  return extra+"\n"+flavor.toUpperCase()+"\nNumber of scoops: "+scoops+
  "\nCone: "+print2+
  "\nToppings: "+print
  +"\nPrice: $"+price;//+toppings.get(0);<- Was proper
 }   
}