
public class Main{
    public static void main(String[] args){
        int[] nums={1,2,3,5,7,3};
        Linkedlist list=new Linkedlist();
       list.InsertEnd(10);
       list.InsertEnd(20);
       list.InsertEnd(30);
       list.InsertEnd(40);
       list.listtoarray();
       
       
     
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
class Linkedlist{
    Node head;
    Linkedlist(){
        this.head=null;
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
        void print(){
        var temp=head;
        System.out.print("Elements are:");
        while(temp!=null){
            System.out.print(temp.data+" , ");
        temp=temp.next;
        }
        }
        Node getHead(){
            return head;
        }
       void listtoarray(){
            Linkedlist list=new Linkedlist();
            Node temp=head;
            int j=length();
            int[] arr=new int[j];
            System.out.print("Elements are:");
            while(temp!=null){
            for(int i=0;i<arr.length;i++){
              arr[i]=temp.data;
              System.out.print(arr[i]+ ",");
              temp=temp.next;
            }
           
            } 
          
       
        }
        int length(){
            int length1=0;
            Node temp=head;
            while(temp!=null){
                length1++;
                temp=temp.next;
            }
            return length1;
            
        }
        
}
