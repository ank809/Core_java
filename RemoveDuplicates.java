// LeetCode 26
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] nums={1, 1, 2};
        int count=1;
            for(int i=1; i<nums.length; i++){
                if(nums[i]!=nums[i-1]){
                    nums[count]=nums[i];
                    count++;
                }
            }
            System.out.println(count);
            System.out.println(Arrays.toString(nums));
    }
    
}
// Or 
class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
