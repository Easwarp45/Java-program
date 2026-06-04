import java.io.*;
public class newthread implements Runnable 
{
Thread t;
public void run()
{
System.out.println("The treads in run function");
}
}
public class hii
{
public static void main(String args[])
{
newthread obj = new newthread();
obj.t.start();
obj.run();
System.out.println("The thread is executed");
}
}
