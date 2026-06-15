import java.util.*;

public class ConvertInputStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char prev = ' ';
        int limit = 0;

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);

            if (temp >= '0' && temp <= '9') {
                limit = limit * 10 + (temp - '0');
            } else {
                if (prev != ' ') {
                    for (int j = 0; j < limit; j++) {
                        System.out.print(prev);
                    }
                }
                prev = temp;
                limit = 0;
            }
        }

        // Print the last character sequence
        for (int j = 0; j < limit; j++) {
            System.out.print(prev);
        }

        sc.close();
    }
}