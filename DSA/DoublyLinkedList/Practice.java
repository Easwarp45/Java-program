package DSA.DoublyLinkedList;
class Node{
    int data;
    Node prev;
    Node next;
    Node (int data)
    {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class Practice {
    public static void main(String args[]){
        Node n1=new Node(5);
        Node n2=new Node(6);
        n1.next=n2;
        n2.prev=n1;
        System.out.println(n2.data);
        System.out.println(n2.prev.data);
        Node n3=new Node(9);
        n2.next=n3;
        n3.prev=n2;
        System.out.println(n3.data);
        System.out.println(n2.prev.data);
    }
}