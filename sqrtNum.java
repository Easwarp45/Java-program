
import java.util.Scanner;
class sqrtNum
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        double guess = num / 2;
        double result =0;
        for (int i = 1; i < guess ; i++)
        {
            result = num / guess ;
            guess = (guess + result ) / 2;

        }
        System.out.println((int) guess);
        //System.out.println((int) result);
    }
}