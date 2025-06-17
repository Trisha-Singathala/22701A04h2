
class Main {
    public static void main(String[] args) {
       
        LinkedList list=new LinkedList();
        list.InsertEnd(10);
        list.InsertEnd(20);
        list.InsertEnd(30);
        list.InsertEnd(60);
        list.InsertBeg(100);
        list.InsertPos(66,3);
        list.InsertPos(76,1);
        list.InsertPos(56,0);
        Node temp=list.head;
         System.out.print("The linkedlist elements are:");
        while(temp!=null){
          System.out.print(temp.data+",");
         temp=temp.next;
          
        }
       
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
class LinkedList{
    Node head;
    LinkedList(){
        this.head=null;
    }

void InsertBeg(int data){
    Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
   }
   void InsertEnd(int data){
    Node newnode=new Node(data);
    if(head==null){
        head=newnode;
        return;
    }
    else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
      }
   } 
   int length(){
       int length_=0;
       var temp=head;
       while(temp!=null){
           length_++;
           temp=temp.next;
       }
       return length_;
   }
       void InsertPos(int data,int pos){
           int length1= length();
           Node newnode=new Node(data);
           if(pos>=0 && pos<=length1){
               if(pos==0){
                   InsertBeg(data);
               }
               else if(pos==length1){
                   InsertEnd(data);
               }
               else{
                   var temp=head;
                   for(int i=1;i<pos;i++){
                       temp=temp.next;
                   }
                   newnode.next=temp.next;
                   temp.next=newnode;
               }
           }
           else{
               System.out.println("Invalid position");
           }
       }
   
   
}
