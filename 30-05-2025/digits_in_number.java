import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the number:");
  
    int count=0;
     n=sc.nextInt();
       int temp=n;
    while(n!=0){
        n=n/10;
        count++;
    }
    System.out.println("number of digits in "+temp+" is "+ count);
 }
}