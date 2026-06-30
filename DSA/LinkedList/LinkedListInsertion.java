import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListInsertion{
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
    void insertAtPos(int data, int pos){
            Node nn = new Node(data);
            Node counter = head;
            for(int i=1;i<pos-1;i++){
                counter=counter.next;
            }
            if(counter == null){
                System.out.println("Invalid Index");
            }
            nn.next=counter.next;
            counter.next=nn;
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
    void search (int data){
        Node temp = head;
        int i=1;
        while (temp != null){
            if(temp.data == data){
            System.out.println(temp.data+" fount At  "+i);
        }
        i+=1;
        temp=temp.next;
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedListInsertion obj=new LinkedListInsertion();
        obj.insertEnd(10);
        obj.insertEnd(20);
        obj.insertEnd(30);
        obj.insertEnd(40);
        obj.disp();
        obj.insertFront(50);
        obj.disp();
        obj.insertAtPos(80,3);
        obj.disp();
        obj.search(30);
    }
}