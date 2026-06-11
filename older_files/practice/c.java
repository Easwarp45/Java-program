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
public class c extends b
{
public static void main (String [] args)
{
c n=new c();
n.disp();
n.disp1();
System.out.println("Class C");

}
}