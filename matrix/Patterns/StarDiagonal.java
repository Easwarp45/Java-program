package matrix.Patterns;
import java.util.*;
public class StarDiagonal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=0;j<=num;j++){
                if(i==j || i+j == num+1){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
