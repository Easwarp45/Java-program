import java.io.*;
import java.util.Scanner;
public class queue
{
int arr[]=new int[5],i=-1,sum=0;
int front=0,end;
void enqueue(int x)
{
i++;
System.out.println("The inserted element is  "+x+" is position is "+i);
arr[i]=x;
disp();
/*++sum;
System.out.println(sum);*/
end=i;
}
void dequeue()
{
for (i=0;i<end;i++)
{
arr[i]=arr[i+1];
disp();
}
}
void disp()
{
System.out.println(arr[i]+" ");
}
public static void main ( String args[])
{
Scanner sc=new Scanner (System.in);
int ele;
queue obj=new queue();
obj.enqueue(3);
obj.enqueue(4);
obj.enqueue(7);
obj.enqueue(5);
System.out.println("the the operation dequeue");
obj.dequeue();
}
}