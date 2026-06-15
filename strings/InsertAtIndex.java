import java.util.Scanner;

public class InsertAtIndex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String choice =sc.nextLine();
        int index = sc.nextInt();
        for ( int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i==index){
                System.out.print(choice);
            }
            System.out.print(ch);
        }
        if(index == str.length()+1){
            System.out.print(choice);
        }
    }
}
