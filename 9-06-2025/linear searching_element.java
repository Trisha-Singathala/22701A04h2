
import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {
        int[] nums={1,4,7,3,87,6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for linear search:");
        int target=sc.nextInt();
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
              index=i;
            }
          
        }
          System.out.println(index==-1?"element not found":"The target element is at: "+index+" index");
    }
}