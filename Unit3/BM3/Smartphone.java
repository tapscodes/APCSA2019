package BM3;
import java.util.ArrayList;
public abstract class Smartphone{
 public String name;
 public String screenLock;
 public boolean unlocked;
 public ArrayList<String> apps = new ArrayList<String>();
 //default constructor for smartphone
 public Smartphone(){
 }
 //constructor for smartphone(must be used in any smartphone)
 public Smartphone(String n, String s){
  name=n;
  if(s.length()<6)
   screenLock=s;
  else
   screenLock="000000";
  unlocked=false;
 }
 //returns the name of a device
 public String getName(){
  return name;
 }
 //checks to see if passcode was right
 public void unlock(String s){
  if(s.equals(screenLock))
   unlocked=true;
  else
   unlocked=false;
 }
 //adds app to apps if it's not already there
 public void download(String a){
  boolean exists=false;
  for(int i=0; i<apps.size(); i++){
   if(apps.get(i).equals(a))
    exists=true;
  }
  if(!exists)
   apps.add(a);
 }
 //compareTo for any phone
 public int CompareTo(Smartphone a){
  if(this.apps.size()<a.apps.size()){
   return -1;
  }
  else if(this.apps.size()>a.apps.size()){
   return 1;
  }
  else{
   return 0;
  }
 }
 //prints the toString stuff for devices
 public String toString(){
  String total = "";
  String unlock="No";
  if(unlocked)
   unlock="Yes";
  total+="Name:     "+name+"\n"+
  "Unlocked: "+unlock+"\n"+
  "Apps:     "+apps+"\n";
  return total;
 }
 //forced(needed) methods
 public abstract void textTone();
}
