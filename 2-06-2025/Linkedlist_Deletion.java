

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
        System.out.println("The linked list elements are:");
        list.print();
         list.deleteEnd();
         System.out.println("----after deleting the element at the end---");
         list.print();
          list.deleteBeg();
            System.out.println("----after deleting the element at the begining---");
          list.print();
        list.deletePos(4);
          System.out.println("----after deleting the element at the position 4---");
       list.print();
     
     
       
         
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
   void print(){
       var temp=head;
       System.out.print("Elements in the list are:");
       while(temp!=null){
          System.out.print(temp.data+",");
         temp=temp.next;
          
        }
        System.out.println("\n");
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
       int deleteBeg(){
           if(head==null){
               System.out.println("There are no element");
               return -1;
           }
           int removedele=head.data;
           head=head.next;
           return removedele;
       }
   int deleteEnd(){
       int j=length();
       var temp=head;
       if(j==0){
           System.out.println("There are no elements");
           return -1;
       }
       if(j==1){
        int removedele=head.data;
        head=head.next;
        return removedele;
   }
   for(int i=1;i<j-1;i++){
       temp=temp.next;
   }
   int removedele=temp.next.data;
   temp.next=null;
   return removedele;
}
int deletePos(int pos){
    var temp=head;
    int removedele;
    int j=length();
    if(pos>=0||pos<j){
        if(pos==0){
            return deleteBeg();
        }
        else if(pos==j){
            return deleteEnd();
        }
        else{
           
          
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
             removedele=temp.next.data;
             return removedele;
        }
        
    }return 1;
    
}
}
