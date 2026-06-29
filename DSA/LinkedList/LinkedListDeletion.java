class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListDeletion {
    Node head=null;
    
    void insert(int data){
        Node n1=new Node(data);
       Node temp=head;
        if(head == null){
            head=n1;
            return;
        }
        //temp=temp.next;
        while (temp.next !=null) {
            temp=temp.next;
        }
        temp.next=n1;
        //head=temp.next;
    }
    void disp(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        //temp = temp.next;
    }
    void DeleteFront(){
        Node temp=head;
        head=temp.next;
        //head=temp.next;
    }
    void DeleteAtEnd(){
        Node temp = head;
        for(int i=1;i<countnodes()-1;i++){
            //System.out.println(i);
            temp=temp.next;
        }
        temp.next=null;
        //disp();
    }
    void DeleteAtPos(int pos){
        Node temp = head;
        int i;
        
        for(i=1;i<pos-1;i++){
            //System.out.println(i);
            temp=temp.next;
            
        }
        //i=i-1;
        temp.next=temp.next.next;
        //System.out.println(i);
        
    }
    int countnodes(){
        Node temp = head;
        int count=0;
        while(temp != null){
            count++;
            temp=temp.next;
            
        }
        return count++;
    }
    public static void main(String[] args) {
        LinkedListDeletion obj=new LinkedListDeletion();
        obj.insert(5);
        obj.insert(6);
        obj.insert(7);
        obj.disp();
        System.out.println("Delete At Front : ");
        obj.DeleteFront();
        obj.disp();
        obj.insert(8);
        obj.insert(9);
        obj.insert(10);
        obj.disp();
        System.out.println("Delete At End : ");
        obj.DeleteAtEnd();
        obj.disp();
        System.out.println("Delete At Position : ");
        obj.DeleteAtPos(3);
        obj.disp();
    }
}
