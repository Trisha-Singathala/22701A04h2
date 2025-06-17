

class Main {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.print();
        int a=stack.pop();
        
        
        System.out.println("The removed element is: "+a);
        stack.print();
        stack.peak();
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
class Stack{
    Node top;
    Stack(){
        this.top=null;
        
    }
boolean isEmpty(){
    if(top==null){
        System.out.println("The stack is empty");
        return true;
    }
    else return false;
}
void push(int data){
    Node newnode=new Node(data);
    newnode.next=top;
    top=newnode;
}
int pop(){
    
    if(isEmpty()){
        return -1;
    }
    int removeele=top.data;
    top=top.next;
    return removeele;
    
}
void print(){
    Node temp=top;
    System.out.println(" ");
    System.out.print("The elements are: ");
    while(temp!=null){
       
        System.out.print(temp.data+" ");
         temp=temp.next;
    }
    System.out.println();
}
void peak(){
    System.out.println("");
    System.out.println("The peak element is "+top.data);
    }
}
    


