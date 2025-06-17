class Main {
    public static void main(String[] args) {
        int[] nums={25,75,-1,16,90,0,79};
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
    
        }
        
    }
    System.out.println("Minimum value in an array is:"+max);
 }
}