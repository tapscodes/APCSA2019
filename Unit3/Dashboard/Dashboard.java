package Dashboard;
public class Dashboard implements Comparable<Dashboard>{
 //Tristan PS
 private int speedometer;
 private int odometer;
 private boolean engineCheck;
 private int total;
 private String engine;
 private String od;
 public Dashboard(){
  speedometer=0;
  odometer=0;
  engineCheck=false;
 }
 public Dashboard(int milesTravelled, int speed){
  if(milesTravelled>=0 && milesTravelled<=99999)
   odometer=milesTravelled;
  else{
   odometer=0;
   engineCheck=true;
  }    
  if(speed>=0 && speed<=100)
   speedometer=speed;
  else{
   speedometer=0;
   engineCheck=true;
  }
  if((milesTravelled>=0 && milesTravelled<=99999) && (speed>=0 && speed<=100))
   engineCheck=false;
 }
 public int compareTo(Dashboard other){
  if(odometer > other.odometer )
   return 1;
  else if(odometer < other.odometer)
   return -1;
  else{
   if(speedometer > other.speedometer)
    return 1;
   else if(speedometer < other.speedometer)
    return -1;
   else{
    if(engineCheck == true && other.engineCheck == false)
     return 1;
    else if(engineCheck == false && other.engineCheck == true)
     return -1;
    else
     return 0;
   }
  }
 }   
 public String race(Dashboard other, int acc1, int acc2){
  String result="";
  for(int i=0; i<acc1; i++){
   this.accelerate();
  }
  for(int j=0; j<acc2; j++){
   other.accelerate();
  }
  if(this.engineCheck){
   result+="First car stalled out!\n";
  }
  if(other.engineCheck){
   result+="Second car stalled out!\n";
  }
  result+="\n" + this.toString() + "\n\n" + other.toString();
  if(this.engineCheck && !other.engineCheck){
   result+="\n\nCar 2 has won the race!";
  }
  else if(!this.engineCheck && other.engineCheck){
   result+="\n\nCar 1 has won the race!";
  }
  else if(this.speedometer<other.speedometer){
   result+="\n\nCar 2 has won the race!";
  }
  else if(this.speedometer>other.speedometer){
   result+="\n\nCar 1 has won the race!";
  }
  else{
   result+="\n\nIt's a tie!";
  }
  return result;
 }  
 public String difference(Dashboard other){
  int time;
  double odm;
  String slowCar;
  String fastCar;
  if(odometer > other.odometer){
   odm=((odometer - other.odometer * 1.0)/other.speedometer * 1.0) * 60.0;
   time=(int)odm;
   slowCar="Second car";
   fastCar="first car";
  }
  else{
   odm=((other.odometer-odometer*1.0)/speedometer*1.0)*60.0;
   time=(int)odm;
   slowCar="First car";
   fastCar="second car";
  }
  return slowCar+" will need to drive for "+time+" minutes to catch "+fastCar+".";
 }
 public void accelerate(){
  if(speedometer<100)
   speedometer++;
  else{
   speedometer=0;
   engineCheck=true;
  }
 }
 public void drive(int numMinutes){
  total=odometer+((speedometer*numMinutes)/60);
  if(total<=99999)
   odometer=total;
  else{
   odometer=0;
   engineCheck=true;
  }    
 }    
 public String toString(){
  if(engineCheck)
   engine="On";
  else
   engine="Off";
  if(odometer<10)
   od="0000"+odometer;
  else if(odometer<100)
   od="000"+odometer;
  else if(odometer<1000)
   od="00"+odometer;
  else if(odometer<10000)
   od="0"+odometer;
  else
   od=odometer+"";
  return "Speedometer: "+speedometer+" MPH\nOdometer: "+od+"\nCheck Engine: "+engine;
 }    
}
