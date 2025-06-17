
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int x=fact(n);
       System.out.println("The factorial of "+n+" is "+x);
    }

public static int fact(int n){
    if(n==0||n==1){
        return 1;
    }
   return n*fact(n-1);
}
}