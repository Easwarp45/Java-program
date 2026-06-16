import java.util.Scanner;
public class GoatLatin {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine()+" ";  
        String word = "";
        int pos =1;
        for ( int i=0;i<str.length();i++){
            char ch1 =str.charAt(i);
            if(ch1 ==' '){
                char ch = word.charAt(0);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.print(word+"m");
                }
                else{
                for(int j=1;j<word.length();j++){  
                    System.out.print(word.charAt(j));
                }
                System.out.print(ch+"m");
            }
           for(int k=1;k<=pos;k++){
                    System.out.print("a");
                }
                if(i!=str.length()-1){
                    System.out.print(" ");
                }
                pos++;
                word="";
            }
            else{
                word=word+ch1;
            }
        }
    }
}