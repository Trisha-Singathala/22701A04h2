
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the number:");
     n=sc.nextInt();
    int evencount=0;
    int temp=n;
    int oddcount=0;
    while(n!=0){
        int rem=n%10;
        n=n/10;
        if(rem%2==0){
        evencount++;
        }
        else{
            oddcount++;
        }
    }
    System.out.println("number of even digits in "+temp+" is "+ evencount);
    System.out.println("number of odd digits in "+temp+" is "+ oddcount);
    if(evencount==0||oddcount==0) System.out.println("The number is good number");
    else System.out.println("The number is bad number");
 }
}