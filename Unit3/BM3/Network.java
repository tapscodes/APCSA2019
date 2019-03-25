package BM3;
import java.util.ArrayList;
public class Network{
 private ArrayList<Smartphone> devices = new ArrayList<Smartphone>();   
 //adds device to the network
 public void addDevice(Smartphone a){
  devices.add(a);
 }
 //default constructor
 public Network(){  
 }
 //prints devices
 public String toString(){
  String total = "Networks\n";
  for(int i=0; i<devices.size(); i++){
   total+=devices.get(i).getName()+"\n";
  }
  return total;
 }
}