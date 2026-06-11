import java.io.*;
import java.util.Random;
class all extends Thread 
{  int ranint;
public void run()
  {
 Random r= new Random(10);
 for (int i=0;i<10;i++)
 {
  ranint=r.nextInt();
  System.out.println(ranint);
   }
 }
public int val(int nu)
{
int nu=ranint;
return(nu);
}
}
public class demo
{
public static void main (String args[])
{
all obj=new all();
int al;
all.start();
al=obj.run();
 if (al%2==0)
  {
 System.out.println("even"+al*al);
   }
 else 
 {
System.out.println("odd"+al*al*al);
}
 }
}