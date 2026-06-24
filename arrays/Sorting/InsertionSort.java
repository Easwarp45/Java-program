package Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<num;i++){
            int key =arr[i];
            int j=i-1;
            while(j >=0 && arr[j] >key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}