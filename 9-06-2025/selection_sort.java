public class Main{
    public static void main(String[] args){
        int[] nums={7,6,4,9,3,5,1,2,8};
        for(int i=0;i<nums.length-1;i++){
        int midIndex=i;
        for(int j=i+1;j<nums.length;j++){
            if(nums[midIndex]>nums[j]){
                midIndex=j;
            }
        }
        int temp=nums[i];
        nums[i]=nums[midIndex];
        nums[midIndex]=temp;
            
        }
        System.out.println("The sorting using selection sort is: ");
        for(int val:nums){
            System.out.print(val+" ");
        }
        
        
        
    }
}