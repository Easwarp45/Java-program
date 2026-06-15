import java.util.Scanner;

public class FindExtraChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        int sum =0;
        int sum1=0;
        for ( int i=0;i<str.length();i++){
            sum =sum+str.charAt(i);
        }
        for(int j=0;j<str1.length();j++){
            sum1=sum1+str1.charAt(j);
        }
        char ch = (char)(sum1-sum);
        System.out.println(ch);
    }
}