

class Main {
    public static void main(String[] args) {
        int[] nums={1,5,8,4,0,6,2};
        for(int i=1;i<nums.length;i++){
            int key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;     
            }
    System.out.print("The sorting using insertion sort is: ");
    for(int val:nums){
            System.out.print(val+" ");
        }
        
}
}
