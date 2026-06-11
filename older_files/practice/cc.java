import java.io.*;
class a
{
void disp()
{
System.out.println("Class A");
}
}
class b extends a 
{
void disp1()
{
System.out.println("Class B");
}
}
public class cc extends b
{
public static void main (String args[])
{
b n= new b();
n.disp();
n.disp1();
System.out.println("Class C");
}}
