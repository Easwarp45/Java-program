package matrix;

import java.util.Scanner;

public class RotateMat180 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col = sc.nextInt();
        int mat[][]=new int[row][col];
        for (int i = 0; i < row; i++) {
         for(int j=0;j<col;j++){
            mat[i][j]=sc.nextInt();
         }   
        }
        System.out.println("The 180 degree Rotated image is :");
        for(int i=row-1;i>=0;i--){
            for (int j=col-1;j>=0;j--){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
