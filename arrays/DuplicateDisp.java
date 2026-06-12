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
        int visiele = arr[0];
for(int i = 0; i < arr.length; i++) {

    boolean alreadyPrinted = false;

    for(int k = 0; k < i; k++) {
        if(arr[k] == arr[i]) {
            alreadyPrinted = true;
            break;
        }
    }

    if(alreadyPrinted){
        continue;
    }
    for(int j = i + 1; j < arr.length; j++) {
        if(arr[i] == arr[j]) {
            System.out.print(arr[i] + " ");
            break;
        }
    }
}
}
}