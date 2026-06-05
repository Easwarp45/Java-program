import java.io.*;
class deii
{
void summa()
{
System.out.println("Nama tha ");
}
}
class dei extends deii
{
void summa()
{
System.out.println("sethapayale");
}
}
public class importt
{
public static void main(String [] args)
{
dei ob=new dei();
ob.summa();
deii ob1=new deii();
ob1.summa();
}
}
