//test values used to test class funcions
package Benchmark;
public class IceCreamRunner{
 public static void main(String args[]){
  System.out.println("NEW TEST HERE");
  //Everything Works As Intended except removing all toppings at once (i forgot what class method is)
  IceCreamPudell test=new IceCreamPudell("yes", 5, true); 
  System.out.println(test);
  //Tests base class^
  IceCreamPudell test2=new IceCreamPudell("yesnt", 4, false); 
  System.out.println(test2);
  //Tests base class with no scoops+come and diff flavor^
  test.flavor=test.sundae(test,test2);
  System.out.println(test);
  //Tests sundae method^
  IceCreamPudell test3=new IceCreamPudell("hmm", 5, false); 
  test3.addTopping("top1");
  test3.addTopping("top2");
  System.out.println(test3);
  //Tests toppings^
  IceCreamPudell test4=new IceCreamPudell("correct", 5, false); 
  test4.addTopping("top3");
  test4.addTopping("top4");
  System.out.println(test4);
  //Tests toppings2^
  test.addTopping("bruh");
  test.flavor=test.sundae(test,test2);
  System.out.println(test);
  //Tests toppings reset^
  IceCreamPudell test5=new IceCreamPudell(test.sundae(test,test2), 5, true);
  test4.addTopping("top3");
  System.out.println(test5);
  //Extra Credit Works As Intended
 }    
}
