import java.util.ArrayList;
class UltimateTeam{
 private ArrayList<UltimatePlayer> players;
 private ArrayList<Coach> coaches;
 public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches){
  this.players=players;
  this.coaches=coaches;
 }
 public String getCutters(){
  String res="";
  for(UltimatePlayer player: players){
   if(player.getPosition().equalsIgnoreCase("Cutter"))
    res+=player+"\n";
  }
  return res;
 }
 public String getHandlers(){
  String res="";
  for(UltimatePlayer player: players){
   if(player.getPosition().equalsIgnoreCase("Handler"))
   res+=player+"\n";
  }
  return res;
 }
 public String toString(){
  String coaches="COACHES: \n\n";
  String players="PLAYERS: \n\n";
  for(Coach coach: this.coaches){
   coaches+=coach+"\n\n";
  }
  for(UltimatePlayer player: this.players){
   players+=player+"\n\n";
  }
  return coaches+"\n\n"+players;
 }
}