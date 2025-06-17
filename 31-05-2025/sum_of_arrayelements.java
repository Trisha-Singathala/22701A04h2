class Main {
    public static void main(String[] args) {
        int[] nums={1,2,3,2,1,3};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        System.out.println("sum of elements in an array is:"+sum);
    }
}