import java.util.*;
public class PangramOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        for(char ch ='a';ch<='z';ch++){
            for (int i=0;i<str.length();i++){
                char ch1 = str.charAt(i);
                if(ch1 >='A' && ch1 <= 'Z'){
                    ch1=(char)(ch1+32);
                }
                if(ch1 == ch){
                    count++;
                    break;
                }

            }
        }
        if(count == 26){
            System.out.println("Panagram");
        }
        else {
            System.out.println("Not a Panagram");
        }
    }
}
