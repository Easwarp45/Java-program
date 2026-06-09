import java.io.*;
public class mythread extends Thread
{
public void run()
{
System.out.println("Hello Pokkie");
}
public static void main (String args[])
{
mythread obj=new mythread();
obj.start();
System.out.println("Hello Pooriki");
}
}