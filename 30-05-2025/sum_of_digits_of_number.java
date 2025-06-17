
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the number:");
     n=sc.nextInt();
     int num=n;
   int sum=0;
   while(n!=0){
       int rem=n%10;
       sum=sum+rem;
       n=n/10;
   }
    System.out.println("the sum of digits of "+num+" is "+sum);
 }
}
