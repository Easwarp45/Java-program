import java.util.*;
public class ConvertInputStr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        char ch = ' ';
        for ( int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            if(temp >= 'a' && temp <= 'z'||temp >= 'A' && temp <= 'b'){
                ch = temp;
            }
            else if((temp >= '0' && temp <= '9')){
                int limit = temp-'0';
                limit = limit * 10 + (temp - '0');
            for (int j=0;j<limit;j++){
                System.out.print(ch);
            }}
        } 
    }
}