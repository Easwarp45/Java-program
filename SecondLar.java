import java.util.*;
public class SecondLar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        for (int i= 0;i< size ; i++){
            arr[i]=sc.nextInt();
        }
        int lar = arr[0];
        int slar = -1 ;
        for ( int i=1;i< size ;i++){
            if (arr[i]> lar )
            {
                slar = lar;
                lar = arr[i];
            }
            else if ( arr[i] < lar && arr[i] > slar)
            {
                slar = arr[i];
            }
        }
        System.out.println("The second largest is: "+slar);
    }
}