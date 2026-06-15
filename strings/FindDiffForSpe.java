import java.util.Scanner;

public class FindDiffForSpe {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int star =0;
        int hash =0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '#'){
                hash++;
            }
            else if(ch == '*'){
                star++;
            } 
            else {
                continue;
            }
        }
        System.out.println(star-hash);
    }
}
