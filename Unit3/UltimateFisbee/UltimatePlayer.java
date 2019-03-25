package UltimateFisbee;
public class UltimatePlayer extends Person {
 private int jerseyNumber;
 private static int num;
 private String position = ""; 
 public UltimatePlayer(String firstName, String lastName, String position){
  super(firstName, lastName);
  if (position.equals("cutter")) {
   this.position = "cutter";
  }
  else 
   this.position = "handler";
  num++;
  jerseyNumber = num;
 }
 public String getPosition(){
  return position;
 }
 public String toString() {
  return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
 }
}
