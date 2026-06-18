import java.util.*;
public class AutoMorphism {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        int temp=num;
        while(temp != 0){
            int dig=temp%10;
            count++;
            temp/=10;
        }
        //System.out.println(count);
        int exp=1;
        for(int i=1;i<=count;i++){
            exp*=10;
        }
        //System.out.println(exp);
        int mul=num*num;
        int dig=mul%exp;
        if(dig==num){
            System.out.println("Automorphic");
        }
        else {
            System.out.println("Not Automorphic");
        }
    }
}
