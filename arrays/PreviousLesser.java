import java.util.*;
public class PreviousLesser{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i< size;i++){
            arr[i]=sc.nextInt();
        }
        int min = arr[0];
        System.out.print(min+" ");
        for ( int i =1;i<arr.length;i++){
            if (arr[i]< min){
                min= arr[i];
                System.out.print(min +" ");
            }
        }
    }
}