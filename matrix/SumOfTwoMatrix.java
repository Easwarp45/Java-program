package matrix;

import java.util.Scanner;

public class SumOfTwoMatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int rowcol=sc.nextInt();
        int mat [][]=new int[rowcol][rowcol];
        int mat1 [][]=new int[rowcol][rowcol];
         for(int i=0;i<rowcol;i++){
            for(int j=0;j<rowcol;j++){
            mat[i][j]=sc.nextInt();
        }
    }
     for(int i=0;i<rowcol;i++){
            for(int j=0;j<rowcol;j++){
            mat1[i][j]=sc.nextInt();
        }
    }
    int sum[][]=new int[rowcol][rowcol];
     for(int i=0;i<rowcol;i++){
            for(int j=0;j<rowcol;j++){
            sum[i][j]=mat[i][j]+mat1[i][j];
        }
    }
    for(int i=0;i<rowcol;i++){
            for(int j=0;j<rowcol;j++){
            System.out.print(sum[i][j]+" ");
        }
        System.out.println();
    }
    }
}