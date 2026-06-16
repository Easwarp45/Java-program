import java.util.*;
public class FirstToInd {
    public static void main(String args []){
        Scanner sc=new  Scanner(System.in);
        String str= sc.nextLine();
        int index = sc.nextInt();
        String res = "";
        res += str.charAt(index);
        for (int i=index;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        for(int ii=index+1;ii<str.length();ii++){
            System.out.print(str.charAt(ii));
        }
    }
}
