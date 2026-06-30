package DSA.DoublyLinkedList;
class DoubleNode{
    int data ;
    DoubleNode prev;
    DoubleNode next;

    public DoubleNode(int data) {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
    
}
public class DoublyLinkedListCreation {
    DoubleNode head=null;
    void insertAtBeginning(int data){
        DoubleNode n=new DoubleNode(data);
        DoubleNode temp=head;
        if(Empty())
        {
            head=n;
            return;
        }
        n.next=head;
        head.prev=n;
        head=n;
    }
    void insertAtEnd(int data){
        DoubleNode n=new DoubleNode(data);
        DoubleNode temp=head;
        if (Empty()) 
        {
            head = n;
            return;
        }
        while(temp.next != null){
            temp=temp.next;
        }
        n.prev=temp;
        temp.next=n;
    }
    void InsertAtPostion(int data,int pos){
        DoubleNode n=new DoubleNode(data);
        DoubleNode temp=head;
        if(Empty()){
            head=n;
        }
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        //System.out.println(temp.data);
        
        n.prev=temp;
        temp.next=n;
        temp=temp.next.next;
        System.out.println(temp.data);
        temp.prev=n.next;
        temp=n;
    }
    void Display(){
        DoubleNode temp=head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    Boolean Empty(){
        return head == null ;
    }
    public static void main(String[] args) {
        DoublyLinkedListCreation obj = new DoublyLinkedListCreation();
        obj.insertAtBeginning(5);
        obj.insertAtBeginning(6);
        obj.insertAtBeginning(7);
        obj.insertAtBeginning(8);
        obj.Display();
        obj.insertAtEnd(4);
        obj.insertAtEnd(3);
        obj.insertAtEnd(2);
        obj.insertAtEnd(1);
        obj.Display();
        obj.InsertAtPostion(4, 4);
        obj.Display();
    }
}