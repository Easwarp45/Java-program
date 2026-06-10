import java.util.*;
public class LeftRotate {
    public static void main(String args[]){
       Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        int arr1[]= new int[size];
        for (int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int lrot = sc.nextInt();
        if(lrot > arr.length){
            lrot = lrot % size;
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j =size;j > arr.length ; j--){
                arr1[i]=arr[j];
            }
        }
}
}