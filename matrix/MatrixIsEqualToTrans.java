package matrix;

import java.util.Scanner;

public class MatrixIsEqualToTrans {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rowcol=sc.nextInt();
        int mat[][]=new int[rowcol][rowcol];
        for (int i = 0; i < rowcol; i++) {
            for(int j=0;j<rowcol;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int Transpose[][]=new int[rowcol][rowcol];
        int count=0;
        for(int i=0;i<rowcol;i++){
            for(int j=rowcol-1;j>=0;j--){
                Transpose[j][i] = mat[i][j];
        }
    }
     for (int i = 0; i < rowcol; i++) {
            for(int j=0;j<rowcol;j++){
                if(Transpose[i][j]==mat[i][j]){
                    count++;
                }
            }}
    if(count == (rowcol*rowcol)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
    }
}