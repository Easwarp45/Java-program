package Stack;

import java.util.Scanner;

public class StackArr {
    int size;
    int stack[];
    int rev[];
    StackArr(int size){
        this.size=size;
        stack=new int[size];
        rev=new int[size];
    }
    int top=-1;
    void push (int data){
        if(top == size){
            System.out.println("Stack OverFlow ");
        }
        else{
            ++top;
            stack[top]=data;
        }
    }
    void disp(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else{
            top--;
        }
    }
    void peek(){
        if(top == -1){
            System.out.println("Stack overflow");
        }
        else {
            System.out.println(stack[top]);
        }
    }
    void  isEmpty(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }
    }
    void isFull(){
        if(top == size-1){
            System.out.println("Stack is OverFlow");
        }
    }
    void reverse(){
        int tt=0;
        if(top == -1){
            System.out.println("Stack is Empty");
        }
        for(int i=top;i>=0;i--){
            rev[tt]=stack[i];
            tt++;
        }
    }
    void revDisp(){
        for(int i=0;i<=top;i++){
            System.out.print(rev[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a size :");
        int size=sc.nextInt();
        StackArr obj = new StackArr(size);
        obj.isEmpty();
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.push(7);
        obj.push(8);
        obj.disp();
        obj.pop();
        obj.disp();
        obj.peek();
        obj.isEmpty();
        obj.isFull();
        obj.reverse();
        obj.revDisp();
    }
}