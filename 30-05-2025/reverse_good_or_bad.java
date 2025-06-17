
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the number:");
     n=sc.nextInt();
    int temp=n;
    int rev=0;
    int count1=0;int count2=0;
    while(n!=0){
        int rem=n%10;
        n=n/10;
      rev=(rev*10)+rem;
      count1++;
    }
    System.out.println("Reverse of "+temp+" is "+ rev);
    int num=rev;
    while(num!=0){
        num=num/10;
        count2++;
    }
    if(count1==count2){
        System.out.println("The number is good number");
    }
    else{
        System.out.println("The number is bad number");
    }
    
 }
}