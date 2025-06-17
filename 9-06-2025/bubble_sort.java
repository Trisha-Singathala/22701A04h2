public class Main{
    public static void main(String[] args){
        int[] nums={7,6,4,9,3,5,1,2,8};
        for(int j=0;j<nums.length-1;j++){
            boolean isSwapped=false;
            for(int i=0;i<nums.length-j-1;i++){
                if(nums[i]>nums[i+1]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped) break;
        }
        System.out.print("The sorted array using bubble sort is: ");
        for(int val:nums){
            System.out.print(val+" ");
        }
    }
}