import java.util.Scanner;

public class CompareTwoMatrixValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowcol = sc.nextInt();
        int mat[][]=new int[rowcol][rowcol];
        int mat1[][]=new int[rowcol][rowcol];
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
    int count =1;
     for(int i=0;i<rowcol;i++){
            for(int j=0;j<rowcol;j++){
                if(mat[i][j]==mat1[i][j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        if(count ==(rowcol*rowcol)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
