import java.util.*;
public class amstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int temp = num ;
        int dig = 0;
       
        while ( temp != 0)
            {
                    //int digit = temp % 10; 
                    dig++;
                    temp /= 10;
            }
            System.out.println(dig);
           int temp1 = num ;
            int n = 0;
        while ( temp1 > 0)
        { 
            int diig = temp1 % 10;
            //System.out.println(diig);\
            int ams=1;
            for ( int i = 1; i <=dig; i++)
            {
            ams = ams* diig ;
            }
            n = n + ams ;
            //n = n + diig;
            
            //System.out.println(ams);
            temp1 /= 10;
        }
        if ( n == num ){
        System.out.println(n+" Amstrong Number");
        }
        else {
            System.out.println(n + "Not an Amstrong Number ");
        }
    }
    
}
