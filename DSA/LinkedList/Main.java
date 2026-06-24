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
                System.out.println(counter.data);
                counter=counter.next;
            }
        }
        void insertFront(Node n){
            Node counter =n;
            counter.next=head;
            head=n;

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
            
            Node n1=new Node(5);
            Node n2=new Node(6);
            Node n3=new Node(7);
            Node n4=new Node(4);
            l1.head=n1;

            //l1.countnodes();
            //l1.dis();
            System.out.println("After Insert At Front");
            l1.insertFront(n4);
            l1.insertFront(n3);
            l1.insertFront(n2);
            l1.dis();
            l1.countnodes();
            
    }
}