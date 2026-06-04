import java.util.Scanner;
public class cal
{
public static void main(String args[])
{
int a,b,choice;
float c,d,e;
Scanner f=new Scanner(System.in);
System.out.println("Enter a two number :");
a=f.nextInt();
b=f.nextInt();
System.out.println("Enter your choice from \n 1.addition \n 2.subraction \n 3.multiplication \n 4.division :");
choice=f.nextInt();
switch(choice)
{
case 1:
{
System.out.println("The addition is :"+(a+b));
break;
}
case 2:
{
System.out.println("The subtraction is :"+(a-b));
break;
}
case 3:
{
System.out.println("The multiplication is :"+(a*b));
break;
}
case 4:
{
System.out.println("The division is :"+(a%b));
break;
}
default:
System.out.println("deii parma padi da...");
}
}}