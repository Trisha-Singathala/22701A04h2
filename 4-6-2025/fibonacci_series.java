
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter thr number: ");
         int n=sc.nextInt();
        int x=fib(n);
        System.out.println("The fibonacci series of "+n+" is "+x);
    }

static int fib(int data){
    if(data==0||data==1){
        return data;
    }
    return fib(data-1)+fib(data-2);
}
}