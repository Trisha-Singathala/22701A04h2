
import java.util.Stack;
class Main {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("The elements are:"+s);
        pushBottom(s,50);
      System.out.println("after insert element in bottom:"+s);
    }

public static void pushBottom(Stack<Integer>stack,int ele){
    if(stack.isEmpty()){
        stack.push(ele);
        return;
    }
    int val=stack.pop();
    pushBottom(stack,ele);
    stack.push(val);
  
}
}