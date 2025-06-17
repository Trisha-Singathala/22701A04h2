
class Main {
    public static void main(String[] args) {
       Queue q=new Queue(5);
       q.enque(10);
        q.enque(20);
         q.enque(30);
          q.enque(40);
          q.enque(50);
          System.out.print("The queue elements are: ");
       q.print();
     
      q.dequeue();
         System.out.print("After deque: ");
       q.print();
        q.dequeue();
         System.out.print("After deque: ");
       q.print();
       q.enque(100);
          System.out.print("The queue elements are: ");
       q.print();
        
        
        
    }
}
class Queue{
    int[] queue;
    int size;
    int rear;
    int front;
  Queue(int size){
      this.size=size;
      this.queue=new int[size];
      this.rear=-1;
      this.front=-1;
  }
  boolean isEmpty(){
  if(rear==-1){
      System.out.println("------The queue is empty------");
      return true;
  }    else return false;
  
  }
  boolean isFull(){
      if(rear==size-1){
          System.out.println("------The queue is full------");
          return true;
      } else return false;
      
    
}
void enque(int data){
    if(isFull()){
        return;
    }
    rear=rear+1;
    queue[rear]=data;
}
int dequeue(){
    if(isEmpty()){
        return -1;
    }
    int remele=front+1;
    for(int i=0;i<rear;i++){
        queue[i]=queue[i+1];
        
    }
    rear=rear-1;
    return remele;
}
void print(){
    for(int i=0;i<=rear;i++){
        System.out.print(queue[i]+" ");
    }
    System.out.println();
}
}