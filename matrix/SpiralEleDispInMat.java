package matrix;

import java.util.Scanner;

public class SpiralEleDispInMat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int mat[][]=new int[size][size];
        int top=0,left=0,right=size-1,bottom=size-1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat[i][j]=sc.nextInt();
            }
            
        }
        while(top <= bottom && left <= right){
            for (int i = top ; i <= right ; i++) {
                System.out.print(mat[left][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(mat[i][right]+" ");
            }
            right--;
            if(top <= bottom){
            for(int i=right;i>= left;i--){
                System.out.print(mat[bottom][i]+" ");
            }
            bottom--;
        }
        if(left <= right){
            for(int i=bottom;i>=top;i--){
                System.out.print(mat[i][left]+" ");
            }
            left++;
        }
        }
    }
}
