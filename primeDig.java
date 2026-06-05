import java.util.*;
class primeDig{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rev=0;
        //int count=0;
        /*while ( num != 0)
        {
            int lasDig=num%10;
            rev = rev * 10 + lasDig;
            num/=10;

        }*/
        while (num != 0)
        {
            int count =0;
            int temp = num % 10; 
        for (int i = 1;i<=temp;i++)
        {
            if (temp % i == 0)
            {
                count ++ ; 
            }
            }
            if (count == 2)
                {
                System.out.println(temp);
                }
        num/=10;
        }
    }
}