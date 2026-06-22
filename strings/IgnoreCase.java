import java.util.*;
public class IgnoreCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2= sc.nextLine();
        boolean same = false;
        if ( str1.length() == str2.length()){
        for (int i = 0; i < str1.length(); i++) {
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(i);
                if (c1 >= 'A' && c1 <= 'Z') {
                    c1 = (char)(c1 + 32);
                }
                if (c2 >= 'A' && c2 <= 'Z') {
                    c2 = (char)(c2 + 32);
                }
                if (c1 == c2) {
                    same = true;
                    break;
                }
            }
        }
        else {
            same = false;
        }
        System.out.println(same);
    }

    }
    