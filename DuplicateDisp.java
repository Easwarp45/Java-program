import java.util.*;
class DuplicateDisp{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];
         for (int i= 0;i< size ; i++){
            arr[i]=sc.nextInt();
        }
        int flag = 0;
        int j=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] != arr[i+1]){
                flag =1;
            }
            if (flag != 0){
                continue;
            }
        }
    }
}
  