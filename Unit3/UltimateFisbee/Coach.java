package UltimateFisbee;
public class Coach extends Person{
 private String role;
 public Coach(String f, String l, String r){
  super (f, l);
  role = r;
 } 
 public String toString(){
  return super.toString() + "\n   Role: " + role;
 }
}