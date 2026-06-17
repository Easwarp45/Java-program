package matrix;

import java.util.Scanner;

public class SumOfColumn {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int mat[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
            mat[i][j]=sc.nextInt();
        }
    }
        int sum =0;
        for(int ii=0;ii<column;ii++){
            sum=0;
            for(int j=0;j<row;j++){
                sum+=mat[j][ii];
    }
    System.out.println(sum);
    }
}
}