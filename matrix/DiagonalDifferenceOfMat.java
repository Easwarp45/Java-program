import java.util.Scanner;

public class DiagonalDifferenceOfMat {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int rowcol=sc.nextInt();
          int mat1[][]=new int[rowcol][rowcol];
         for(int i=0;i<rowcol;i++){
            for(int j=0;j<rowcol;j++){
            mat1[i][j]=sc.nextInt();
        }
    }
    int p=0;
    for(int i=0;i<rowcol;i++){
        p=p+mat1[i][i];
    }
    int s=0;
    int index =rowcol-1;
    for (int i = 0; i < rowcol; i++) {
        s=s+mat1[i][index];
        index--;
    }
    if(p>s){
    System.out.println(p-s);}
    else 
    {
        System.out.println(s-p);
    }
    }
}
