import java.util.*;
public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String value = sc.nextLine();
        int vow =0;
        int cons =0;
        for (int i=0;i<value.length();i++){
            char c=value.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'    ){
                    vow++;
            }
            else if(c == ' '){
                continue;
            }
            else 
                {
                    cons++;
                }       
    }
        System.out.println(vow);
        System.out.println(cons);
}
}