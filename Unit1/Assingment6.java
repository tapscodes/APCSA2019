import java.util.Scanner;
public class Assingment6
{
 public static void main(String args[])
 {
   String[] str1=new String[10000];
   String[] str2=new String[10000];
   String end1="";
   String end2="";
   String input="";
   int index=0;
   int endex=0;
   int endex2=0;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the values for the first array, up to 10000 values, enter 'End' to quit");
   //checks to see if array 1 ended, takes input otherwise and converts it properly
   while(!input.equals("End"))
   {
    input=s.nextLine();
    input=convert(input);
    str1[index]=input;
    index++;
   }
   //saves the value for the end of the string
   endex=index-1;
   System.out.println("Enter the values for the second array, up to 10000 values, enter 'End' to quit");
   index=0;
   input="";
   //checks to see if array 2 ended, takes input otherwise and converts it properly
   while(!input.equals("End"))
   {
    input=s.nextLine();
    input=convert(input);
    str2[index]=input;
    index++;
   }
   //saves the value for the end of the string
   endex2=index-1;
   //STUFF AFTER ARRAYS ACTUALLY EXIST(Prints arrays)
   end1=print(str1,endex);
   end2=print(str2,endex2);
   System.out.println("First Array\n"+end1);
   System.out.println("Second Array\n"+end2);
   if(alpha(str1, endex)==0 || alpha(str2, endex2)==0)
   System.out.println("Merged Array\n"+end1+end2);
   else
   System.out.println("Error: Arrays not in correct order");
 }
 public static String print(String[] x, int end)
 {
   String total="";
   for(int i=0;i<end;i++)
   {
     total=total+x[i]+" ";
   }
   return total;
 }
 public static int alpha(String[] x, int end)
 {
     for(int i=0;i<end;i++)
   {
     if((x[i].compareTo(x[i+1])<=0))  
     {
     }
     else
     {
         return 1;
     }
   }
   return 0;
 }
 public static String convert(String y)
 {
  y=y.toLowerCase();
  String x=y.substring(0,1);
  x=x.toUpperCase();
  y=x+y.substring(1);
  return y;
 }
}

