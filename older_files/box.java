import java.io.*;
import java.util.Scanner;
class demobox
{
	Scanner n=new Scanner
	int l,b,h;
	demobox()
{
		l=0;
		b=0;
		h=0;
}
}
public class box extends demobox
{
box()
{
super();
}
void disp()
{
System.out.println("volume="+(l*b*h));
}
public static void main(String args[])
{
box obj=new box();
obj.disp();
}
}
