// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
package Leetcode;

public class Seaech_In_Rotated {
        public boolean search(int[] nums, int target) {
            for(int i=0; i<nums.length; i++){
                if(nums[i]==target){
                    return true;
                }
            }
            return false;
        }
}
