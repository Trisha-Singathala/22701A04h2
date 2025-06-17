
import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {
        int[] nums={1,4,6,45,78,87};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for binary search:");
        int target=sc.nextInt();
        int index=-1;
        int left=0;
        int right=nums.length-1;
       while(left<=right){
          int mid=(left+right)/2;
          if(target>nums[mid]){
              left=mid+1;
               
          }
          else if(target<nums[mid]){
              right=mid-1;
              
          }else{
              index=mid;
              break;
          }
       }
       System.out.println(index==-1?"Element is not found":"Element is at "+index+" index");
    }
}