import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
       int[] nums = {1, 2, 3, 4}; 
        ArrayList<Integer> result = new ArrayList<>();
        generateCombinations(nums, 0, result);
    }
    public static void generateCombinations(int[] nums,int index,ArrayList<Integer>result){
        if(index==nums.length){
            System.out.println(result);
            return;
        }
        result.add(nums[index]);
        generateCombinations(nums,index+1,result);
        result.remove(result.size()-1);
          generateCombinations(nums,index+1,result);
    }
}