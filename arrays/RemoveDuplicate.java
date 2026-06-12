import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt(); 
        int arr[]=new int[size];      
        for (int i= 0;i< size ; i++){
            arr[i]=sc.nextInt();
        }
        int i =0;
        for ( int j=1;j<size;j++){
            if( arr[j]!= arr[i]){
                arr[i+1]=arr[i];
                i++;
            }
        }
        for (int ii= 0;ii< size ; ii++){
           System.out.print(arr[ii]+" ");
        }
    }
}