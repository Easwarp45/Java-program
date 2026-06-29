package DSA.Queue;

import java.util.Scanner;

public class QueueArr {
    int size;
    int queue[];

    QueueArr(int size) {
        this.size = size;
        this.queue = new int[size];
    }
    int front=-1;
    int rear =-1;
    void EnQueue(int data){
        int val=data;
        if(front ==-1){
            ++front;
            rear++;
            queue[front]=val;
        }
        else{
        queue[++rear]=val;
        
        }
    }
    void DeQueue(){
        
        if(IsFull()){
            System.out.print("Queue is Empty");
        }
        front++;
        
    
    }
    void disp(){
        if(IsEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }
    Boolean IsFull(){
        return rear == size-1;
    }
    Boolean IsEmpty(){
        return front == -1 && rear ==-1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        QueueArr obj = new QueueArr(size);
        obj.disp();
        obj.EnQueue(1);
        obj.EnQueue(2);
        obj.EnQueue(3);
        obj.disp();
        obj.DeQueue();
        obj.disp();
    }
}
