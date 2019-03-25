/*
 * AP CS MOOC
 * Term 2 - Assignment 2, Part 2: FreightTrain
 * A class which represents a freight train with multiple boxcars.
 */
import java.util.ArrayList;
public class FreightTrain
{
 private ArrayList<Boxcar> train = new ArrayList<Boxcar>();
 public FreightTrain(){
  Boxcar def = new Boxcar();
  train.add(def);
 }
 public FreightTrain(int n){
  if(n>0)
   for(int i=0;i<n;i++){
    train.add(new Boxcar());   
   }
  else{
   Boxcar def = new Boxcar();
   train.add(def);
  }
 }
 public String toString(){
  String total="";
  for(Boxcar k: train){
   total += k.toString()+"\n";
  }
  return total;
 }
 public void setCargo(String c){
  for(Boxcar k: train){
   k.setCargo(c);
  }
 }
 public void setMultiCargo(){
  int c = 0;
  for(Boxcar k: train){
   if(c==4)
    c=0;
   if(c==0) 
    k.setCargo("gizmos");
   else if(c==1) 
    k.setCargo("gadgets");
   else if(c==2) 
    k.setCargo("widgets");
   else if(c==3) 
    k.setCargo("wadgets"); 
   c++;
  }
 }
 public void fillTrain(){
  for(Boxcar k: train){
   while(!k.isFull()){
    k.loadCargo(); 
   }    
  }
 }
 public void callForRepair(int i){
  train.get(i).callForRepair();
 }
}
