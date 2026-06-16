import java.util.*;
public class DispLongWord{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String word="";
        String longest="";
        for (int i = 0; i <= str.length(); i++) {
            if(i==str.length() || str.charAt(i) == ' '){
                if(word.length()>longest.length()){
                    longest = word;
                }word="";
            }
            else 
                {
                    word+=str.charAt(i);
            }
        }
        System.out.println(longest);
    }
}