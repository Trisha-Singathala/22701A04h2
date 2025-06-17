import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
      if(n>=4){
          if(n%2==0){
              System.out.println("The number of operations to convert "  +n+" to 1 is : 2");
          }else  System.out.println("The number of operations to convert "  +n+" to 1 is : 3");
      }
      else System.out.println(n-1);
    }
}