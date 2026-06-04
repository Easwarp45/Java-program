import java.io.*;
public class copypaste
{
public static void main(String args[])
{
String sou="united.txt";
String des="des.txt";
try(BufferedReader fw=new BufferedReader (new FileReader(sou));BufferedWriter fr=new BufferedWriter (new FileWriter(des)))
{
String ch;
while((ch= fw.readLine())!= null)
{
fr.write(ch);
}
}
catch(IOException e)
{
System.out.println("Error="+e.getMessage());
}
System.out.println("Everything was Successful");
}
}

