import java.io.*;
public class demoarray
{
static void demo1(int arr[])
{
int min=arr[0];
for(int i=1;i<arr.length;i++)
{
if(min>arr[i])
{
min=arr[i];
System.out.println(min);
}
}
}
public static void main(String args[])
{
demoarray obj=new demoarray();
int a[]={22,3,4,5,2};
obj.demo1(a);
}}


