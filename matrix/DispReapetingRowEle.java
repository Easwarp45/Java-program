package matrix;
import java.util.Scanner;
public class DispReapetingRowEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rowcol=sc.nextInt();
        int col=sc.nextInt();
        int mat[][]=new int[rowcol][col];
        for (int i = 0; i < rowcol; i++) {
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int p=0,s=0;
        for(int i=1;i<rowcol;i++){
           Boolean value=true;
            for (int j=0;j<col;j++){
                if(mat[i][j]==mat[p][s]){
                    if(value){
                    System.out.print(mat[p][s]+" ");
                        value=false;
                    }
                }
            }
            s++;
        }
    }
}