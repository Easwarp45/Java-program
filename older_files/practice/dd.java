import java.io.*;
public class dd
{
    public static void main(String args[])throws IOException
    { 
        FileInputStream fin=new FileInputStream("hi.txt");
        char ch;
	int c=1;
        ch=(char)fin.read();
        while (c==1)
        {
	if(ch!='a')
 	{
            System.out.println(ch);
	}
	else 
	{
 	c=0;
}
        }
     }
     fin.close();
} 