class Main {
    public static void main(String[] args) {
        int[] nums={25,75,-1,16,0,79};
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
    
        }
        
    }
    System.out.println("Minimum value in an array is:"+min);
 }
}