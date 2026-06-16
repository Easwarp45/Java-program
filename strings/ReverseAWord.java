import java.util.Scanner;

public class ReverseAWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        String rev = "";
        for (int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(ch !=' '){
                rev=ch+rev;
                
            }
            else{
                System.out.print(rev+" ");
                rev=" ";
            }
        }
    }
}