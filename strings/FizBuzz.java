
import java.util.Scanner;

public class FizBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int str =sc.nextInt();
        for (int i =1;i<=str;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizBuzz");
            }
            else if ( i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0 ){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
