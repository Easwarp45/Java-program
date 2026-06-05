import java.io.*;
import java.util.Scanner;
public class selection_sort
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int arr[]= new int[5];
int i,j=0,choice=0,value,index;
System.out.println("Enter the value:");
choice=sc.nextInt();
for( i=0; i<choice; i++)
{
    System.out.println("Enter the array value:");
    arr[i]=sc.nextInt();  
}
/*for (int ii=0 ;ii<5;ii++)
{
    System.out.print(arr[ii]);
}*/
for (int ini=0;ini < choice;ini++)
{
    index=ini+1;
for( j=index;j<choice;j++)
{
    if(arr[ini]<arr[index])
    {
        value=arr[index];
        arr[index]=arr[ini];
        arr[ini]=value;
        //arr[ini+1]=arr[ini];
    }
}
}
for (int ii=0 ;ii<choice;ii++)
{
    System.out.print(arr[ii]);
}
System.out.println("");
}
}