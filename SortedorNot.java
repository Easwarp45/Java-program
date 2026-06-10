import java.util.*;
public class SortedorNot {
    public static void main(String args[]){
       Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        int count=0;
        for (int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i< arr.length-1 ; i++){
            if(arr[i] >= arr[i+1]){
                count+=1;
            }
        }
        if( count == size-1)
        {
            System.out.println("Sorted");
        }
        else {
            System.out.println("Unsorted");
        }
    }
}