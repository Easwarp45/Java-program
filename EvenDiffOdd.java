import java.util.*;
public class EvenDiffOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        int even = 0;
        int odd =0;
        for (int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0;i< arr.length;i++){
            if (arr[i]%2==0){
                even+=arr[i];
            }
            else {
                odd+=arr[i];
            }
        }
        if(even > odd){
        System.out.println(even-odd);
        }
        else {
            System.out.println(odd-even);
        }
    }
}