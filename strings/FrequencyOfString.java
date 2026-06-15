import java.util.*;
public class FrequencyOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int count =0;
            boolean flag =false;
            char ch = str.charAt(i);
            for(int j=0;j<i;j++){
                if(str.charAt(j)==str.charAt(i)){
                    flag=true;
                }
            }
            if(flag){
                for(int k = 0;k<str.length();k++){
                    if(str.charAt(k)==str.charAt(i)){
                        count++;
                    }
                }
                System.out.println(ch +"-"+ count);
            }
            //System.out.println(ch +"-"+ count);
        }
    }
}
