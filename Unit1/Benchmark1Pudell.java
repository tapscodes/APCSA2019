import java.util.Scanner;
class Benchmark1Pudell
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    //declares text variable, word to search for+replacement word, and final text
    String text="";
    String word="";
    String replace="";
    String end="";
      // switch Charizard and Jigglypuff
    String s1 = "My favorite Pokemon has always been Jigglypuff. I mean, what's not to " +
      "like? Jigglypuff is a large, orange, dragon-like Pokemon. When Jigglypuff " +
      "gets angry, it breathes fire. Which isn't so bad, unless your name is Ash. " +
      "On the other hand, my least-favorite Pokemon is probably Charizard. As we " +
      "all know, Charizard is a round, pink pokemon. Charizard's only redeeming quality " +
      "is its singing voice, which isn't even that impressive considering it puts " +
      "everyone to sleep. Very disappointing indeed.";
    // switch worst and best
    String s2 = "The Philadelphia Flyers are the worst hockey team in the NHL. Of " +
      "all teams in the Metropolitan division, they are the worst to support. Their " +
      "new mascot, Gritty, is the worst in the league. On the other hand, the best " +
      "team is the New Jersey Devils. They play in the best stadium, and their " +
      "mascot, the New Jersey Devil, is obviously \"creative\" and best in " +
      "the league.";
    //prompts user for variable values
    System.out.println("Please enter the text in which the word will be replaced");
    text=s.nextLine();
    System.out.println("Please enter the word you want to be replaced");
    word=s.nextLine();
    System.out.println("Please enter the word to replace it with");
    replace=s.nextLine();
    //prints results
    end = wordSwap(text,word,replace);
    System.out.println("Results:\n"+end);
  } // main(String[])
  //method to swap words given above
  public static String wordSwap(String text, String current, String change)
  {
   String temp = ""; //temporary placeholder
   String newText = ""; // Replaced String(ending value)
   int remaining = 0; // amount of letters left in String
   // repeats for length of string-word to be replaced
   // does this because if there is less letters than that word to be replaced, it can't exist
   for (int i = 0; i <= text.length()-current.length(); i++) 
   {
    temp = text.substring(i, i+1);
    //checks if word exists at i, changes if it's there
    if (text.substring(i, i+current.length()).equals(current)) 
    {
     temp=change+" ";
     i+=current.length();
    }
    remaining=i;
    newText+=temp;
   }
   //makes new string with replaced word
   newText+=text.substring(remaining+1, text.length());
   //returns value
   return newText;
 } // wordSwap(String, String, String)
} // Benchmark
