package matrix;
import java.util.Scanner;
public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int rowcol = sc.nextInt();
        int mat[][]=new int[rowcol][rowcol];
        for (int i=0;i<rowcol;i++){
            for(int j=0;j<rowcol;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Transpose of a Matric");
        for(int i=0;i<rowcol;i++){
            for(int j=rowcol-1;j>=0;j--){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}
