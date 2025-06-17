
public class Main{
    public static void main(String[] args){
        int[] nums={1,2,3,5,7,3};
        Linkedlist list=new Linkedlist();
        Node head=Linkedlist.arraytolist(nums);
        list.head=head;
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
        System.out.print("Elements are: ");
        while(temp!=null){
            System.out.print(temp.data+" , ");
        temp=temp.next;
        }
        }
        Node getHead(){
            return head;
        }
        static Node arraytolist(int[] nums){
            Linkedlist list=new Linkedlist();
            for(int i=0;i<nums.length;i++){
                list.InsertEnd(nums[i]);
            }
            return list.getHead();
        }
        
}
