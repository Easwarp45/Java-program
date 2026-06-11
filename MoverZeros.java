import java.util.*;
public class MoverZeros {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int res[]=new int[size];
        int index=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                res[index]=arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
