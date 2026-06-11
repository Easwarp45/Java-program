import java.util.Scanner;

public class SecondMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        for (int i= 0;i< size ; i++){
            arr[i]=sc.nextInt();
        }
        int min = arr[0];
        int smin = 32215468 ;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                smin = min;
                min = arr[i];
            }
            else if (arr[i] > min && arr[i] < smin){
                smin = arr[i];
            }
        }
        System.out.println(smin);
    }
}
