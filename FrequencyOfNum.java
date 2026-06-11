import java.util.Scanner;

public class FrequencyOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr [] = new int[size];
        for (int i= 0;i< size ; i++){
            arr[i]=sc.nextInt();
        }
        for ( int i=0;i < arr.length ; i++){
            boolean alcount=false;
            for(int k =0;k < i;k++){
                if(arr[i]== arr[k]){
                    alcount=true;
                }
            }
            if(alcount){
                continue;
            }
            int count =0;
            for ( int j=0;j < arr.length;j++){
                if ( arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+" : "+count);
        }
    }
}