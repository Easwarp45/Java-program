package Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int arr[]=new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=sc.nextInt();
        }
        /* for(int i=0;i<num-1;i++){
            for(int j=0;j<num-1-i;j++){
                if(arr[j] < arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        } */
       for(int i=num-1;i>=1;i--){
        int swap=0;
        for(int j=0;j<=i-1;j++){
            if(arr[j+1]>arr[j]){
                int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swap =1;
            }
            
        }
        if(swap == 0){
                break;
            }
       }
        for (int i = num-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
