public class Boxcar
{
 private String cargo = "";
 private int numUnits;
 private boolean repair;
 public Boxcar(){
  this("gizmos", 5, false);
 }
 public Boxcar(String c, int u, boolean r){ 
  numUnits = u; 
  if (u<0 || u>10)
   numUnits = 0;
  else
   numUnits = u; 
  repair = r; 
  if (r == true)
   numUnits = 0; 
  c = cargo.toLowerCase(); 
  if (c.equals("gizmos") || c.equals("gadgets") || c.equals("widgets") || c.equals("wadgets"))
   cargo = c;
  else
   cargo = "gizmos"; 
 }
 public String toString()
 {
  String r = ""; 
  String c = cargo.toLowerCase(); 
  if (repair == true)
   r = "in repair";
  else
   r= "in service";
  String a = numUnits + " " + c + "\t" + r; 
  return a;
 }
 public void loadCargo() {     
  numUnits ++;
  if (repair == false){
   if (numUnits > 10 )
    numUnits = 10;  
  } 
  else
  numUnits = 0; 
 }
 public String getCargo(){
  String b = cargo; 
  return b;
 }
 public void setCargo(String c){  
  c=c.toLowerCase();
  if(c.equals("gizmos") || c.equals("gadgets") || c.equals("widgets") || c.equals("wadgets"))
   cargo = c;
  else
   cargo = "gizmos";
 }
 public boolean isFull(){
  if(numUnits == 10)
   repair = true; 
  else
   repair = false; 
  return repair;
 }
 public void callForRepair(){
  repair = true; 
  numUnits = 0; 
 }
}