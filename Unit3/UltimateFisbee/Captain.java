package UltimateFisbee;
public class Captain extends UltimatePlayer{
 private boolean type;
 private String y;
 public Captain(String f, String l, String p, boolean t){
  super (f, l, p);
  if(t == true){
   type = true;
   y = "offense";
  }
  else{
   type = false;
   y = "defense";
  }
 }
 public String toString(){
  return super.toString() + "\n   Captain: " + y;
 }
}