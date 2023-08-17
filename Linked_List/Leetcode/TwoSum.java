// https://leetcode.com/problems/two-sum/
package Leetcode;
public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2, 7, 11, 15};
        int target=9;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}

// Another way to do the same question

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
                
            }
        }
        return ans;
    }
    
}
