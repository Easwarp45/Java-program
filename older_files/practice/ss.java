import java.io.*;
import java.util.Scanner;
public class ss
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int c;
try
{
int a=scan.nextInt();
int b=scan.nextInt();
c=a/b;
}
catch (ArithmeticException e){
System.out.println("anything divided by zero is infinity"+e);
}
catch (Exception e){
System.out.println(e);
}
finally 
{
System.out.println("The program is ended ");
}
}

  -
}
