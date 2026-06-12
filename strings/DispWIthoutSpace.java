import java.util.*;
public class DispWIthoutSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char temp=str.charAt(i);
            if(temp == ' '){
                continue;
            }
            else {
                System.out.print(temp+"");
            }
        }
    }
}
