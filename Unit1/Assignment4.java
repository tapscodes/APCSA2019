import java.util.Scanner;
  class Assignment4
  {
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      //prompt
      System.out.println("Enter msg board post:");
      String post = s.nextLine();
      //finds where the post starts
      int user=(post.indexOf( "-" ));
      //sets username to everything up to the -(start of message)
      String username=post.substring(0,user);
      user+=2;
      //sets msg to everything after user
      String msg=post.substring(user);
      //VARIABLES
      String msg2="";
      int qey=0;
      int pts=0;
      int money=0;
      int x=0;
      int space=0;
      int curse1=0;//^^
      int curse2=0;//qey
      int curse3=0;//$
      //makes the message Lowercase so the program can scan correctly
      msg=msg.toLowerCase()+" ";
      //loops 10 times and scans each word to check if it contains a curseword
      while(x < msg.length())
      {
       space=msg.indexOf(" ");
       String word =" "+ (msg.substring(0,(space+1)))+" ";
       msg = msg.substring(space+1); 
       //declares curse word scanners(for visual ease)
       curse1=word.indexOf(" ^^ ");
       curse2=word.indexOf(" qey ");
       curse3=word.indexOf(" $ ");
       //Checks if any of the "curse words" are found in the message, if so it increases its count by 1
       if((curse1== 0) && (curse2==0) && (curse3==0))
       {
       }
       else if(curse1>=0)
       {
         pts++;
       }
       else if(curse2>=0)
       {
        qey++;
       }
        else if(curse3>=0)
       {
        money++;
       }
      }
      //prints results based on if the counters increased at all
      if(money == 0 && qey == 0 && pts == 0){
        System.out.println("CLEAN");
        System.out.println("Results: ");
      }
      if(money > 0 || qey > 0 || pts > 0){
        System.out.println("Results: ");
        System.out.println("BAD");
      }
      //prints the username found at the start and the values of the counters
      System.out.println(username);
      System.out.println("^^: "+pts);
      System.out.println("qey: "+qey);
      System.out.println("$: "+money);
    }
  }
