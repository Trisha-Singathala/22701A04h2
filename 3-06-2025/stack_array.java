

class Main {
    public static void main(String[] args) {
        Stack stack =new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("THe stack elements are:");
        stack.print();
        System.out.println("After pop the elements are:");
        stack.pop();
        stack.print();
        stack.peak();
    }
}
class Stack{
    int[] stack;
    int size;
    int top;
    Stack(int size){
        this.stack=new int[size];
        this.size=size;
        this.top=-1;
    }
    boolean isFull(){
        if(top==size-1){
        System.out.println(" stack is full");
        return true;
    }
    else {
        return false;
    }
    }
    boolean isEmpty(){
        if(top==-1){
            System.out.println("Stack is empty");
            return true;
        }
        else{
            return false;
        }
    }
    void push(int data){
        if(isFull()){
            return;
        }
        else{
            top=top+1;
            stack[top]=data;
        }
    }
        int pop(){
            if(isEmpty()){
                return -1;
            }
            else{
              int data=stack[top];
              top=top-1;
              return data;
                  
              }  
            }
        
        void peak(){
           if(isEmpty()){
               return ;
           }
           else{
            int val=stack[top];
            System.out.println("The peak value is "+val);
        }
            
        }
        void print(){
            for(int i=top;i>=0;i--){
                System.out.println("|"+stack[i]+"|");
            }
            System.out.println("-----");
        }
        
    
}