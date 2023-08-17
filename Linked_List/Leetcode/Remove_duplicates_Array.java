package Leetcode;

//  https://leetcode.com/problems/find-all-duplicates-in-an-array/

// Better Time complexity
import java.util.ArrayList;
import java.util.List;

class Remove_duplicates_Array {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                // Swap elements to their correct positions
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            } else {
                i++;
            }
        }
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans.add(nums[j]);
            }
        }
        
        return ans;
    }
}

// OR 
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> ans= new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){
                if(nums[j]<nums[j-1]){
                    int temp= nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
    
}
