package SortTeam;
public class TeamMember
{
 private String fullName;
 private String idString;
 //just in case if there is no name/ID given
 public TeamMember(){
  fullName="NO NAME GIVEN";
  idString="NO ID GIVEN";
 }
 public TeamMember(String name, String id){
  fullName=capitolize(name);
  idString=capitolize(id);
 }
 //method that properly compitolizes a String
 public String capitolize(String word){
  word=word.toLowerCase();
  String first=word.substring(0,1).toUpperCase();
  String newWord=first+word.substring(1,word.length());
  for(int i=0; i<word.length(); i++){
   if(word.charAt(i) == 32 || word.charAt(i) == 9)
    newWord=newWord.substring(0,i+1)+word.substring(i+1, i+2).toUpperCase()+word.substring(i+2, word.length());
  }
  return newWord;
 }
 //returns name of teammember
 public String toString(){
  return fullName;
 }
 //returns id
 public String getIdString(){
  return idString;
 }
 //compares current ID to other ID
 public int compareTo(TeamMember other){
  if(idString.compareTo(other.getIdString())<0){
   return -1;
  }
  else if(idString.compareTo(other.getIdString())>0){
   return 1;
  }
  else{
   return 0;
  }
 }
}