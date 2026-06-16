package matrix;

import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int num1=sc.nextInt();
        int mat [][]=new int[num][num1];
        for (int i =0;i<num;i++){
            for(int j=0;j<num1;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int sum =0;
         for (int i =0;i<num;i++){
            for(int j=0;j<num1;j++){
                sum=sum+mat[i][j];
            }
        }
        System.out.println(sum+"");
        /*for (int i =0;i<num;i++){
            for(int j=0;j<num1;j++){
                System.out.print(sum[i][j]+" ");
    }
    System.out.println();
}*/
    }
}