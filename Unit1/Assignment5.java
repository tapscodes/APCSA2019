import java.util.Scanner;
class Assignment5 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        //prompts
        System.out.println("Enter the first String:");
        String origin = s.nextLine();
        System.out.println("Enter pivot String:");
        String pivot = s.nextLine();
        
        //checks if the pivot string is in the current one
        if(origin.contains(pivot)) 
        {
          //finds location of pivot string
          int loc = origin.indexOf(pivot);
          //prints from pivot->end
          System.out.print(origin.substring(loc+pivot.length(),origin.length()));
          //prints pivot
          System.out.print(origin.substring(loc,loc+pivot.length()));
          //prints start->pivot
          System.out.print(origin.substring(0,loc)+"\n");
        } 
        else 
        {
          System.out.println("Error: Pivot String not found.");
        }
    }
}