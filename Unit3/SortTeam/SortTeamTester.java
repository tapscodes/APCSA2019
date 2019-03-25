package SortTeam;
import java.util.Scanner;
import java.util.ArrayList;
public class SortTeamTester
{
 //sorts array to be in order
 public static void sort(ArrayList <TeamMember> a){
  for(int i = 1; i < a.size(); i++){
   for(int j = i; j > 0; j--){
    if(a.get(j).compareTo(a.get(j-1)) == -1){
     //sorts array properly
     TeamMember temp = a.get(j);
     a.set(j, a.get(j-1));
     a.set(j-1, temp);
    }
   }
  }
 }
 //main method
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  ArrayList <TeamMember> list = new ArrayList <TeamMember>();
  ArrayList<TeamMember> sort = new ArrayList <TeamMember>();
  String name = "";
  String ID = "1"; 
  //takes in names
  while(!(name.equals("stop"))){
   System.out.println("Enter the next name:");
   name = scan.nextLine();
   name = name.toLowerCase();
   if(!(name.equals("stop"))){
    System.out.println("Enter the next ID:");
    ID = scan.nextLine();
    TeamMember a = new TeamMember(name, ID);
    list.add(a);
   }
  }
  //sorts then prints names
  sort(list);
  System.out.println(list);
 }
}
