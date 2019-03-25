package BM3;
public class iPhone extends Smartphone
{
 //default constructor   
 public iPhone(){
  this("Someone's iphone x","000000");
 }
 //constructor if name+passcode are given
 public iPhone(String n, String s){
  super(n,s);
  for(int i=0; i<apps.size(); i++){
   apps.remove(i);
  }
 }
 //textTone of iphone
 public void textTone(){
  System.out.println("tri-tone");
 }
}
