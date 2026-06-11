import java.util.*;

public class SumTillOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        sc.close();
        while (num >= 10) {
            int sum = 0;
            int temp = num;
            while (temp != 0) {
                sum += temp % 10;  
                temp /= 10;
            }
            System.out.println("Digit sum: " + sum);
            num = sum; 
        }
        System.out.println("Single digit result: " + num);
    }
}