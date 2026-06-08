import java.util.*;
class strongNum {
    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);
        int num = inpu.nextInt();
        int sum = 0;
        int temp = num;

        while (temp != 0) {
            int dig = temp % 10;
            int fact = 1;

            for (int i = 1; i <= dig; i++) {
                fact *= i;
            }

            sum += fact;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Non Strong Number");
        }
    }
}