
 // 27 Question https://leetcode.com/problems/remove-element/submissions/

 // [3, 2, 2, 3]  val= 3, ans=[2,2];
package Leetcode;

public class RemoveElement {
        public int removeElement(int[] nums, int val) {
            int n=nums.length;
            int count=0;
            for(int i=0; i<n; i++){
                if(nums[i]!=val){
                    nums[count]=nums[i];
                    count++;
                }
            }
            return count;
        }
        
    }
