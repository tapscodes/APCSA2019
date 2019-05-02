import java.util.Scanner;
import java.lang.Math;
class Lesson_1011_Activity
{
    public static void main(String[] args)
     {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number in base 8: ");
      int x = s.nextInt();
      int eight=x%10;
      int seven=((x%100)-eight)/10;
      int six=((x%1000)-eight-seven)/100;
      int five=((x%10000)-eight-seven-six)/1000;
      int four=((x%100000)-eight-seven-six-five)/10000;
      int three=((x%1000000)-eight-seven-six-five-four)/100000;
      int two=((x%10000000)-eight-seven-six-five-four-three)/1000000;
      int one=(x-eight-seven-six-five-four-three-two)/10000000;
      int total=0;
      if (x>99999999 || one>7 || two>7 || three>7 || four>7 || five>7 || six>7 || seven>7 || eight>7)
       System.out.println("ERROR: Incorrect Octal Format");
      else  
        {
          total=((one*2097152)+(two*262144)+(three*32768)+(four*4096)+(five*512)+(six*64)+(seven*8)+(eight*1));
          System.out.println(total);
        }
}
}