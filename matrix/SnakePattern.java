package matrix;
import java.util.Scanner;
public class SnakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mat[][] = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) { 
                for (int j = 0; j < num; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = num - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}
