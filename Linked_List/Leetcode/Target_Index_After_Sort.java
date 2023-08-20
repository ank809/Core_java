// https://leetcode.com/problems/find-target-indices-after-sorting-array/
// nums=[1, 2,5, 2, 3], target=3, ans=[1, 2]

package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Target_Index_After_Sort {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList <Integer> list= new ArrayList<>();
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j>0;j--){
                if(nums[j]<nums[j-1]){
                    // swap them
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j]==target){
                list.add(j);
            }
        }
        return list;
    }
}
