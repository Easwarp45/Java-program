import java.util.*;
class dispDig{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rev=0;
        System.out.println("The output is:");
        while(num != 0)
        {
            int lastDig=num%10;
            rev=rev*10+lastDig;
            num = num / 10;
        }
        while (rev != 0){
            int temp = rev % 10;
            System.out.println(temp);
            rev = rev / 10;
        }
    }       
}