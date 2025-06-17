
import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {
       binarySearch(new int[] {1,6,4,8,3,9,5},6);
       binarySearch(new int[] {1,6,4,8,3,9,5},67);
       binarySearch(new int[] {1,6,4,8,3,9,5},9);
    }
        public static void binarySearch(int[] nums,int target){
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