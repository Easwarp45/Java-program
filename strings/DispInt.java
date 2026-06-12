import java.util.*;
public class DispInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
             if (c == '1' || c == '2' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0'){
                System.out.print(c);
        }
    }
}
}