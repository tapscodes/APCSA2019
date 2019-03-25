public class Dashboard
{
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
