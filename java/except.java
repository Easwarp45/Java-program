import java.util.Scanner;

public class Except {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int c;

        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Anything divided by zero is infinity");
        } catch (Exception e) {
            System.out.println("An error occurred");
        } finally {
            System.out.println("The program has ended");
        }

        scan.close();
    }
}
