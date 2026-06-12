import java.util.*;
public class FirstOccurence {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for(int j=1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    System.out.println(arr[i]);
                }
            }
            /*if (count == 1){
                System.out.println(arr[i]);
            }*/
            break;
        }
    }
}
