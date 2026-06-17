package matrix;

import java.util.Scanner;

public class MiniElementinMatColumn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rowcol=sc.nextInt();
          int mat1[][]=new int[rowcol][rowcol];
         for(int i=0;i<rowcol;i++){
            for(int j=0;j<rowcol;j++){
            mat1[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<rowcol;i++){
            int min =mat1[i][0];
            for(int j=0;j<rowcol;j++){
                if(mat1[j][i]< min){
                    min=mat1[j][i];
                }
                
            }
            System.out.print(min+" ");
        }
    }
}
