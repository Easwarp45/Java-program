import java.util.*;
public class PalindromeString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String dup = new String();
        for ( int i=str.length()-1;i>=0;--i){
                char dupp = str.charAt(i);
                dup = dup+dupp;
        }
        int flag=-1;
        System.out.println(dup);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==dup.charAt(i)){
                flag++;
            }
        }
        if(flag > 0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}