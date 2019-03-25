package Elevens;
public class Shuffler {
 private static final int SHUFFLE_COUNT = 1;
 private static final int VALUE_COUNT = 4;
 public static void main(String[] args){
  System.out.println("Results of "+SHUFFLE_COUNT+" consecutive perfect shuffles:");
  int[] values1 = new int[VALUE_COUNT];
  for (int i = 0; i<values1.length; i++){
   values1[i] = i;
  }
  for (int j = 1; j<=SHUFFLE_COUNT; j++){
   perfectShuffle(values1);
   System.out.print("  "+j+":");
   for (int k = 0; k<values1.length; k++){
    System.out.print(" "+values1[k]);
   }
   System.out.println();
  }
  System.out.println();
  System.out.println("Results of "+SHUFFLE_COUNT+" consecutive efficient selection shuffles:");
  int[] values2 = new int[VALUE_COUNT];
  for (int i = 0; i<values2.length; i++){
   values2[i] = i;
  }
  for (int j = 1; j<=SHUFFLE_COUNT; j++){
   selectionShuffle(values2);
   System.out.print("  " + j + ":");
   for (int k = 0; k<values2.length; k++){
    System.out.print(" " + values2[k]);
   }
   System.out.println();
  }
  System.out.println();
 }
 public static void perfectShuffle(int[] values){
  int [] shuffled = new int [values.length];
  //evens=i,odds=j
  for(int i = 0, k = 0, j=(values.length/2); i<(values.length/2) && k<values.length;j++,i++,k+=2){
   shuffled[i] = values[k];
   shuffled[j] = values[k+1];
  }
  for (int i=0;i<values.length;i++){
   values[i]=shuffled[i];
  }
 }
 public static void selectionShuffle(int[] values){
  int [] shuffled = new int [values.length];
  for(int i = values.length-1; i>=0; i--){
   shuffled[i] =(int)(Math.random()*(i+1));
  }   
  for(int i=0; i<values.length; i++){
   values[i]=shuffled[i];
  }
 }
}