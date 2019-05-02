
/*
 * Runs a couple different mtehods
 * Author: Tristan P.-S.
 * SummerAssignmentPudell v1
 */
public class SummerAssignmentPudell
{
 static int count=0;
 static int day=0;
 static int month=0;
 //Method counts absences by checking each value in an array for if its <4
 public static int countAbsences(int[] y)
 {
  count=0;
  //for loop to test each value in an array
  for(int i=0; i<y.length; i++)
  {
   if(y[i]<4)
    count++;
   else
    count=count;
  }
  return count;
 }
 //Checks work for plagiarism by comparing two passages
 public static boolean plagiarism(String x, String y)
 {
  if (x.contains(y))
  return true;
  else
  return false;
 }
 //check the year to see if it's a leap year from a year input
 public static boolean isLeapYear(int y)
 {
  if ((y%4==0) && (y%100!=0) && (y%400==0))
  return true;
  else
  return false;
 }
 //Gives you the date from a day and year input
 public static String getDate(int d, int y)
 {
  //if statement to check if day value>days in year
  if (d>365||d<1||y<1)
  {
  //checks if values of either variable are <1
  if (d<1||y<1)
  return "ERROR: Invalid number of days.\nDay Number: "+d+"\nYear: "+y;
  //checks for leap year
  else if(isLeapYear(y)==true)
   {
    //checks to make sure number of days in leap year are valid
    if(d>366)
     return "ERROR: Invalid number of days.\nDays Beyond 1 Year:"+(d-365);
    //runs for leap year
    else
    {
     //january
     if (1<d && d<=31)
     return "1/"+d+"/"+y;
     //febuary
     else if (31<d && d<=60)
     return "2/"+(d-31)+"/"+y;
     //march
     else if (60<d && d<=91)
     return "3/"+(d-60)+"/"+y;
     //april
     else if (91<d && d<=121)
     return "4/"+(d-91)+"/"+y;
     //may
     else if (121<d && d<=152)
     return "5/"+(d-121)+"/"+y;
     //june
     else if (152<d && d<=182)
     return "6/"+(d-152)+"/"+y;
     //july
     else if (182<d && d<=213)
     return "7/"+(d-182)+"/"+y;
     //august
     else if (213<d && d<=244)
     return "8/"+(d-213)+"/"+y;
     //september
     else if (244<d && d<=274)
     return "9/"+(d-244)+"/"+y;
     //october
     else if (274<d && d<=305)
     return "10/"+(d-274)+"/"+y;
     //november
     else if (305<d && d<=335)
     return "11/"+(d-305)+"/"+y;
     //december
     else
     return "12/"+(d-335)+"/"+y;
    } 
   }
  //returns that it is not a leap year so the value of days being>365 is wrong
   else
   return "ERROR: Invalid number of days.\nDays Beyond 1 Year:"+(d-365);
  }
  else
  //runs normally if no errors are found
  {
  //january
     if (1<d && d<=31)
     return "1/"+d+"/"+y;
     //febuary
     else if (31<d && d<=59)
     return "2/"+(d-31)+"/"+y;
     //march
     else if (59<d && d<=90)
     return "3/"+(d-59)+"/"+y;
     //april
     else if (90<d && d<=120)
     return "4/"+(d-90)+"/"+y;
     //may
     else if (120<d && d<=151)
     return "5/"+(d-120)+"/"+y;
     //june
     else if (151<d && d<=181)
     return "6/"+(d-151)+"/"+y;
     //july
     else if (181<d && d<=212)
     return "7/"+(d-181)+"/"+y;
     //august
     else if (212<d && d<=243)
     return "8/"+(d-212)+"/"+y;
     //september
     else if (243<d && d<=273)
     return "9/"+(d-243)+"/"+y;
     //october
     else if (273<d && d<=304)
     return "10/"+(d-273)+"/"+y;
     //november
     else if (304<d && d<=334)
     return "11/"+(d-304)+"/"+y;
     //december
     else
     return "12/"+(d-334)+"/"+y;
  }
 }
 //Main Method
 public static void main(String[] args)
 {
   System.out.println("1999 is a leap year: " + isLeapYear(1999));
   System.out.println("2100 is a leap year: " + isLeapYear(2100));
   System.out.println("");
   System.out.println("Day 247 of 2018: " + getDate(247, 2018));
   System.out.println("Day 366 of 2020: " + getDate(366, 2020));
   System.out.println("");
   System.out.println(getDate(0, 2018));
   System.out.println(getDate(366, 2018));
   System.out.println("");
   System.out.println("Joke 1 is Stolen: " + plagiarism("There are 10 types of people; those who understand binary, and those who don't.", "those who understand binary"));
   System.out.println("\n");
   int[] student1 = {3, 7, 7, 4, 7};
   int[] student3 = {0, 0, 3, 0, 0};
   System.out.println("Student 1 Absences: " + countAbsences(student1));
   System.out.println("Student 3 Absences: " + countAbsences(student3));     
 }
}
