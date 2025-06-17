

import java.util.Stack;
class Main {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("The elements are:"+s);
        reverse(s);
      System.out.println("after reversing:"+s);
    }

public static void reverse(Stack<Integer>stack){
    if(stack.isEmpty()){
        
        return;
    }
    int val=stack.pop();
    reverse(stack);
     stack.push(val);
    
  
}
}
