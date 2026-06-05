import java.io.*;
public class readwrite
{
public static void main(String args[])
{
String source="united.txt";
try (BufferedWriter br=new BufferedWriter(new FileWriter(source)))
{
br.write("Hi good morning \n");
br.write("I'm Fine what about you");
}
catch(IOException e)
{
System.err.println("Error="+e.getMessage());
}
//read a file 
String ch;
try (BufferedReader brr=new BufferedReader(new FileReader(source)))
{
while((ch = brr.readLine()) != null)
{
System.out.println(ch+" ");
} 
}
catch (IOException e)
{
System.err.println("Error="+e.getMessage());
}
}}
