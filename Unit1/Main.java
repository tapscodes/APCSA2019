import java.util.Scanner;
import java.lang.Math;
class Main {
 public static String duplicate(String str) {
  String duplicate_word = "";
  //code for string with even numbers
  if (str.length() % 2 == 0) {
   int numRepeats = str.length();
   for (int i = 0; i < numRepeats; i++) { //
    for (int i2 = 0; i2 < numRepeats * 2; i2++) {
     duplicate_word = duplicate_word + str.charAt(i);
    }
   }
  }
  //code for string with odd numbers
  else if (str.length() % 2 != 0){
   int numRepeats = str.length();
   for (int i = 0; i < numRepeats; i++) { //
    for (int i2 = 0; i2 < numRepeats; i2++) {
     duplicate_word = duplicate_word + str.charAt(i);
    }
   }
  }
  //return of duplicate_word to MAIN
  return duplicate_word;
  }
 public static String isEdhesivePalindrome(String str) {
  str = str.toUpperCase();
  int count = 0;
  if (str.length() > 3 && str.length() < 15) {
   //code for equivalent characters and counts matches
   for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == str.charAt(str.length() - 1 - i) || ((str.charAt(i) == '4' || str.charAt(i) == 'A') && (str.charAt(str.length()-1-i) == 'A' || str.charAt(str.length() -1-i) == '4')) || ((str.charAt(i) == '3' || str.charAt(i) == 'E') && (str.charAt(str.length()-1-i) == 'E' || str.charAt(str.length() -1-i) == '3')) || ((str.charAt(i) == '0' || str.charAt(i) == 'O') && (str.charAt(str.length()-1-i) == 'O' || str.charAt(str.length() -1-i) == '0')))
     count ++;
   }
  }
  //returns true if all characters match
  if (count == str.length()) {
   String result = "Nice, you found an Edhesive Palindrome!";
   return result;
  }
  else{
   String result = "Too bad, that isn't an Edhesive Palindrome.";
   return result;
  }  
  }
  public static double numberScramble(double num) {
    if (num < 0)
    return 0.0;
    double return_num = num + 5.0;
    return_num = return_num / 2;
    return_num = Math.sqrt(return_num);
    //returns (add5 to num, divide num by 2, sqrt num)
    return return_num;
  }
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    //introduction and duplicate
    System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
    String wordToDuplicate = scan.nextLine();
    String duplicatedWord = duplicate(wordToDuplicate);
    System.out.println("The duplicated String is: " + duplicatedWord);
    //check if Edhesive palindrome
    System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
    String wordToCheckIfPalidrome = scan.nextLine();
    String ifWordIsPalindrome = isEdhesivePalindrome(wordToCheckIfPalidrome);
    System.out.println(ifWordIsPalindrome);
    //scramble number
    System.out.println("Almost done! Please enter a number to scramble.");
    double numToScramble = scan.nextDouble();
    double scrambledNum = numberScramble(numToScramble);
    System.out.println("The scrambled number is: " + scrambledNum);
  }
}