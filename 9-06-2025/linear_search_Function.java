
import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {
    
      linearSearch(new int[] {1,6,43,7,3,8},8);
     linearSearch(new int[] {1,6,43,7,3,8},43);
     linearSearch(new int[] {1,6,43,7,3,8},9);
    }
      public static void linearSearch(int[] nums,int target){
          int index=-1;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
              index=i;
            }
          
        }
          System.out.println(index==-1?"element not found":"The target element is at: "+index+" index");
    }
}