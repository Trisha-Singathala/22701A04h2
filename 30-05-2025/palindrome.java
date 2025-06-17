
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the number:");
     n=sc.nextInt();
    int temp=n;
    int rev=0;
  
    while(n!=0){
        int rem=n%10;
        n=n/10;
      rev=(rev*10)+rem;
      
    }
    System.out.println("Reverse of "+temp+" is "+ rev);
   
    if(rev==temp){
        System.out.println(temp+" is palindrome");
    }
    else{
        System.out.println(temp+" not palindrome");
    }
    
 }
}