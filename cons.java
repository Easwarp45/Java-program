import java.io.*;
import java.util.scanner;
class cons
{
int a,b;
public cons()
{
int aa=10;
int bb=20;
}
}
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int val1;
int val2;
System.out.println("Enter the value for value 1:");
val1=sc.nextInt();
val2=sc.nextInt();
cons obj=new cons();
obj.num(val1,val2);
}