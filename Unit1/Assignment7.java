/**
 * Assignement 7
 * @Tristan P.-S.
 */
import java.util.Scanner;
public class Assignment7
{
 //Return a String with every character in str repeated n times, where n is the length of str.
 //if n is an even number, each character should be repeated twice as many times 
 public static String duplicate(String str){
  int l=str.length();
  int i=0;
  int g=0;
  String com="";
  while(i<l){
   g=0;
   while(g<l){
    com+=str.charAt(i); 
    if(l%2==0)
     com+=str.charAt(i);
    g++;    
   }    
   i++;
  } 
  return com;
 }
 //Returns true if string is same forward+backward
 //and length>3 && <15, also 4=a, 3=e,0=o in any string given
 public static boolean isEdhesivePalindrome(String str){
  if(str.length()<3 || str.length()>15)   
  return false;
  int i=0;
  int f=str.length()-1;
  String g="";
  String r="";
  while(i<str.length()){
   if(str.charAt(i)=='4')
    g+='a';
   else if(str.charAt(i)=='3')
    g+='e';
   else if(str.charAt(i)=='0')
    g+='o';
   else
    g=g+str.charAt(i);
   i++;    
  }
  g=g.toLowerCase();
  while(f>=0){
   r+=g.charAt(f);
   f--; 
  } 
  if(g.equals(r))
  return true;
  return false;
 }
 //If number entered is <0, return 0.00
 //Else, add 5 then divide by 2, then square root it and return
 public static double numberScramble(double n){
  if(n<0)
  return 0.00;
  else{
   n+=5;
   n=n/2;
   n=Math.sqrt(n);
  }
  return n;
 }
 //Main method(testing area)
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate."); 
  String r1=s.nextLine();
  System.out.println("The duplicated String is: "+duplicate(r1));
  System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
  String r2=s.nextLine();
  if(isEdhesivePalindrome(r2)==true)
  System.out.println("Nice, you found an Edhesive Palindrome!");
  else
  System.out.println("Too bad, that isn't an Edhesive Palindrome.");
  System.out.println("Almost done! Please enter a number to scramble.");
  double r3=s.nextDouble();
  System.out.println("The scrambled number is: "+numberScramble(r3));
 }
}
