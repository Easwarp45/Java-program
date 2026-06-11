import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Binary Value :");
        int num = sc.nextInt();
        int dec =0;
        int base = 1;
        while(num > 0){
            int dig = num % 10;
            dec += (dig * base);
            base *= 2;
            num/=10;
        }
        System.out.println(dec);
    }
}
