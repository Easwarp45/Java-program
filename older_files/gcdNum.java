
import java.util.Scanner;

class gcdNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = sc.nextInt();
        int rem;
        while ( num1 != 0)
        {
            rem = num % num1;
            num = num1;
            num1 = rem ;
            //return rem;
        }
        System.out.println("The Gcd :" + num);
    }
}