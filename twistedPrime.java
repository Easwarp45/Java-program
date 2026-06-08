import java.util.*;
class twistedPrime
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        int rev = 0;
        int coun = 0;
        for ( int i =1;i<=temp ; i++)
        {
            if ( temp % i == 0){
                count++;
            }
        }
            if ( count != 2)
            {
                System.out.println(num +"not Prime");
            }
            
            else{
                System.out.println(num +" Prime");
                while ( temp > 0)
                {
                    int dig = temp % 10;
                    rev= (rev * 10)+ dig;
                    temp /= 10;
                    
                }
               // System.out.println(rev);
                for (int ii = 1; ii <= rev ; ii++)
                {
                    if (rev % ii == 0){
                        coun ++;
                    }
                }
                if(coun == 2) {
                    System.out.println(rev +" Twisted is prime ");
                    }
                else {
                    System.out.println(rev+"Twsited is not prime ");
                    }
                
            }
            
        }
    } 