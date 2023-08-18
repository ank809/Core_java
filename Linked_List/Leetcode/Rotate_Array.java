// https://leetcode.com/problems/rotate-array/
package Leetcode;

//Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]

public class Rotate_Array {
    public void rotate(int[] nums, int k) {
        k%=nums.length; // if the value of k is 7 then the  array will not rotate and index out of bound array
       reverse(nums, 0, nums.length-1);
       reverse(nums, 0, k-1);
       reverse(nums, k, nums.length-1);
      }
      public void reverse(int [] arr, int start, int end){
        while(start<end){
          int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          start++;
          end--;
        }
      }
}
