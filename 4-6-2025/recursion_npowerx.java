
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int base=sc.nextInt();
         System.out.println("Enter the power number: ");
        int power=sc.nextInt();
        
        System.out.println("The "+base+" power "+power+" is "+powern(base,power));
    }

public static int powern(int n,int x){
    if(x==0){
        return 1;
    }
  
    return n*powern(n,(x-1));
}
}