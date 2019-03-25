package BM3;
public class NetworkTest
{
 public static void main(String args[]){
  Network network1 = new Network();
  Smartphone iPhone1 = new iPhone();
  Smartphone iPhone2 = new iPhone("Facundo's IceCream", "NoPas");
  iPhone1.download("app1");
  iPhone1.download("app1");
  iPhone1.unlock("000000");
  iPhone1.download("app2");
  network1.addDevice(iPhone1);
  network1.addDevice(iPhone2);
  iPhone1.textTone();
  System.out.println(iPhone1);
  System.out.println(iPhone2);
  System.out.println(network1);
  System.out.println(iPhone1.CompareTo(iPhone2));
 }
}
