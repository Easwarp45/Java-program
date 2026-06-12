import java.util.*;
public class DispSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(temp >= 'A' && temp <= 'Z'
                || temp >= 'a' && temp <= 'z' ||
                temp >= '0' && temp <= '9'){
                    continue;
                }
                else {
                    System.out.print(temp+" ");
                }
        }
    }
}
