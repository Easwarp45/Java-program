import java.io.*;
import java.util.Scanner;
public class list
{
void insert_first(int ar[])
{
int i=1;
int ins=5;
ar[0]=ins;
for(i=1;i<=5;i++)
{
ar[i+1]=arr[i];
}
for (i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
}
System.out.println(" ");
}
public static void main(String args[])
{
list obj=new list();
Scanner sc = new Scanner(System.in);
int arr[]=new int [5];
int i=0,x;
for(i=0;i<=arr.length;i++)
{
x=sc.nextInt();
arr[i]=x;
}
obj.insert_first(arr);
}
}
