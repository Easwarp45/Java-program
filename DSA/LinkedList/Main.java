/* class Student {
    int id;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        
        // System.out.println(s1.id);
        Student s2 = new Student();    
        s1.id = 10;        
        s2.id = 20;
        System.out.println(s1.id);
        System.out.println(s2.id);
    }
} */
/* class Test {
    int data;
    Test(int data){
       this.data=data;
       System.out.println(data);
    }
}

public class Main {
    public static void main(String[] args) {
        Test t1 = new Test(5);
        t1.Test(5);

        Test t2 = t1;
        t2.x = 15;

        System.out.println(t1.x);
        System.out.println(t2.x);
    }
} */
class Node
{
    int data;
    Node next;
    Node(int da){
        this.data=da;
        this.next=null;
    }
}
    public class Main{
        Node head=null;
        public void countnodes(){
            int count=0;
            Node counter = head;
            while(counter != null){
                count++;
                counter=counter.next;
            }
            System.out.println(count);
        }
        void dis(){
            Node counter=head;
            while(counter !=null){
                System.out.print(counter.data+" ");
                counter=counter.next;
            }
            System.out.println("");
        }
        void insertFront(int da){
            Node n4=new Node(da);
            n4.next=head;
            head=n4;
        }
        void insertEnd(int data){
            Node n5 =new Node(data);
            if(head == null){
                head=n5;
                return;
            }
            Node counter = head;
            while(counter.next != null){
                counter=counter.next;
            }
            counter.next=n5;
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
        
        public static void main(String[] args) {
            Main l1=new Main();
            /* Node n1=new Node(5);
            Node n2=new Node(6);
            Node n3=new Node(7); */
            
           /*  System.out.println(n1.data);
            System.out.println(n1.next.next.data);
            // System.out.println(n2.data);
            // System.out.println(n3.next);
            System.out.println(n1.next.data);
            int count=0;
            Node coach =n1; */
            
            /* Node n1=new Node(5);
            Node n2=new Node(6);
            Node n3=new Node(7);
            Node n4=new Node(4);
            l1.head=n1; */

            //l1.countnodes();
            //l1.dis();
           /*  System.out.println("After Insert At Front");
            l1.insertFront(5);
            l1.insertFront(6);
            l1.insertFront(7);
            l1.dis(); */
            // l1.countnodes();
            l1.insertFront(3);
            l1.dis();
            System.out.println("After Insert At end");
            l1.insertEnd(8);
            l1.insertEnd(7);
            l1.insertEnd(6);
            l1.insertEnd(5);
            l1.insertEnd(4);
            l1.dis();
            System.out.println("After Insert At Front");
            l1.insertFront(9);
            l1.insertFront(10);
            l1.insertFront(11);
            l1.dis();
            System.out.println("Counts of a node");
            l1.countnodes();
            System.out.println("Insert at any pos");
            l1.insertAtPos(77, 6);
            l1.dis();
            
    }
}