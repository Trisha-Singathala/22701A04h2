public class Main{
    public static void main(String[] args){
        int[] nums={1,1,2,3,3,4,5,5,6,6,6,6,7};
        System.out.print("The array elements are: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        int i=0;
        
        for(int j=0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
            
        }
        System.out.println();
        System.out.print("After removing the duplicates the array elements are: ");
        for(int j=0;j<=i;j++){
            System.out.print(nums[j]+" ");
        }
    }
}