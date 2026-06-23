/*import java.util.*;
public class TitleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();
        for ( int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (i==0 && ch >= 'a' && ch <= 'z'){
                ch = (char)(ch-32);
               
            }
            if (ch == ' ') {
                char temp = str.charAt(i + 1);

                if (temp >= 'a' && temp <= 'z') {
                     ch = (char)(temp - 32);
                    }
            }
            System.out.print(ch);
        }
    }
}*/
import java.util.*;

public class TitleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((i == 0 || str.charAt(i - 1) == ' ')
                    && ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            else if(ch >= 'A' && ch<='Z' && str.charAt(i-1) == ' ' ){
                ch=(char)(ch+32);
            }

            System.out.print(ch);
        }
    }
}