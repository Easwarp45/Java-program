import java.util.Scanner;

public class PalindromeArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        int f=0;
        int l = arr.length-1;
        for (int i= 0;i< size ; i++){
            arr[i]=sc.nextInt();
        }
        int fla=1;
        while(f<l){
            if(arr[f] == arr[l]){
                fla=0;
            }
            f++;
            l--;
        }
        if(fla == 1){
            System.out.println("Not a Palindrome");

        }
        else {
            System.out.println("Palindrome");
        }
    }
}
