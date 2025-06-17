

class Main {
    public static void main(String[] args) {
       Queue q=new Queue();
       q.enque(10);
       q.enque(20);
       q.enque(30);
       q.enque(40);
       q.enque(50);
       q.print();
       System.out.println();
       System.out.println("The length of the queue is:"+q.length());
       int data=q.deque();
       
          System.out.println("The removed element  is:"+data);
        q.deque();
       q.print();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        
    }
}
class Queue{
    Node head;
    Node rear;
    Queue(){
        this.head=null;
        this.rear=rear;
    
    }
    boolean isEmpty(){
        if(head==null){
            return true;
        }
        else return false;
    }
    void enque(int data){
        Node newnode=new Node(data);
        if(isEmpty()){
            this.head=newnode;
            this.rear=newnode;
        }
            rear.next=newnode;
            rear=rear.next;
        }
        int deque(){
            if(isEmpty()){
                System.err.println("queue is empty");
                return -1;
            }
            else{
                int val=head.data;
                head=head.next;
                return val;
            }
        }
        void print(){
            var temp=head;
            System.out.print("The elements are:");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int length(){
            var temp=head;
            int count=0;
            while(temp!=null){
                count= count+1;
                temp=temp.next;
            }
            return count;
        }
    }
