import java.util.*;
class dispDiviAno{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        /*int guess = num / 2;
        for ( int i = 1 ; i <= guess ; i++ ){
            int res = num / guess ;    // this commented statement is for find the square root value 
            guess = ( guess + res )/ 2 ; 
        }
        System.out.println(guess); */
        for (int i = 1; i*i <= num  ; i++)    // instead of finding sqrt separately use i*i 
        {
            if ( num % i == 0){
                System.out.println(i+" The Divisor");
                
                if ( num % i != i)
            {
                System.out.println( (num /i) +" The Divisor");
            }
            }
        }   
    }
}