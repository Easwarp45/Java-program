import java.io.*;
class ride
{
public void  param(int a,int b)
{
System.out.println("The sum is="+(a+b));
}
}
class riding extends ride
{
public void param(int a,int b,int c)
{
System.out.println("The sum is="+(a+b+c));
}
}
public class loading
{
public static void main(String [] args)
{
ride ob1=new ride();
ob1.param(10,12);
riding ob=new riding();
ob.param(10,13,12);
}
}
