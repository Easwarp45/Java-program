import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedlist{
    Node head=null;
    void insertEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void insertFront(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;         
        head=newNode;   
    }
    void disp(){
        Node temp=head;
        while(temp!=null){
            System.out.print("|"+temp.data+"|->");
            temp=temp.next;
        }
        System.out.print(" null");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linkedlist obj=new linkedlist();
        obj.insertEnd(10);
        obj.insertEnd(20);
        obj.insertEnd(30);
        obj.insertEnd(40);
        obj.disp();
        obj.insertFront(50);
        obj.disp();
    }
}