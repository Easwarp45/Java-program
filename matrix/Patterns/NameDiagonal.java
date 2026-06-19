package matrix.Patterns;
import java.util.*;
public class NameDiagonal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int num=str.length()-1;
        for(int i=0;i<=num;i++){
            for(int j=0;j<=num;j++){
                if(i==j ) {
                    System.out.print(str.charAt(i)+" ");
                }
                else if(i+j == num){
                    System.out.print(str.charAt(num-i)+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
