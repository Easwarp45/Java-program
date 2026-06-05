import java.io.*;
public class over
{
int sum(int a,int b)
{
System.out.println("Sum="+(a+b));
}
int sum (double a,double b)
{
System.out.println("Sum="+(a+b));
}
public static void main (String args[])
{
over n=new over();
System.out.println("sum="+(n.sum(10,20)));
System.out.println("sum="+(n.sum(1.0,2.0)));
}
}