import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;

        for(char ch = 'a'; ch <= 'z'; ch++) {

            boolean found = false;

            for(int i = 0; i < str.length(); i++) {

                char c = str.charAt(i);

                if(c >= 'A' && c <= 'Z') {
                    c = (char)(c + 32);
                }

                if(c == ch) {
                    found = true;
                    break;
                }
            }

            if(found) {
                count++;
            }
        }

        if(count == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not Pangram");
        }
    }
}