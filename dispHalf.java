import java.util.Scanner;

public class dispHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        int start = 0;int temp=0;
        int end = (size / 2)-1;
        for (int idx = 0; idx < arr.length; idx++) {
                arr[idx]=sc.nextInt();
        }
        while ( start < end)
        {
            temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        start += 1;
        end = arr.length - 1;
        while ( start < end ){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        System.out.print("The half Swapped is :");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
