import java.io.*;
public class ori_queue
{
int queue[]=new int[5],i=0;
int front=-1,end;
void enqueue(int x)
{
	front++;
	queue[front]=x;
	disp();
	end++;
	//System.out.println(front);
}
void dequeue()
{	
	end--;
	queue[i]=queue[i+1];
	System.out.println("i="+i);
	i++;
	disp();
	//System.out.println(end);
}
//System.out.println(end);
void disp()
{
System.out.println("the end value is :"+end);

for(int i=0;i<end;i++)
{
System.out.print(queue[i]+" ");
}
System.out.println(" ");
}
public static void main (String args[])
{
ori_queue obj = new ori_queue();
obj.enqueue(10);
obj.enqueue(20);
obj.enqueue(30);
obj.enqueue(40);
obj.enqueue(50);
obj.dequeue();
obj.dequeue();
}
}



