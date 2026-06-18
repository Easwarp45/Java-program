package matrix;
import java.util.*;
public class BoundaryEleDisp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int num1=sc.nextInt();
        int mat[][]=new int[num][num1];
        for(int i=0;i<num;i++){
            for(int j=0;j<num1;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        /*for(int i=0;i<num;i++){
            for(int j=0;j<num1;j++){
                if(i==0 || i==num-1 || j==0 || j==num1-1 ){
                    System.out.print(mat[i][j]+" ");
                }
            }
        }*/
       System.out.print("The Boundary Elements:");
       for(int i=0;i<num1;i++){
        System.out.print(mat[0][i]+" ");
       }
       for(int i=1;i<(num-1);i++){
            System.out.print(mat[i][num1-1]+" ");
       }
       int row=num-1;
       for(int i=num1-1;i>=0;i--){
        System.out.print(mat[row][i]+" ");
       }
       for(int i=(num-1)-1;i>=1;i--){
        System.out.print(mat[i][0]+" ");
       }
    }
}