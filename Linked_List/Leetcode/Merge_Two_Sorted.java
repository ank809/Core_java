package Leetcode;

public class Merge_Two_Sorted {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i=0;
            int j=0;
           while(i<n+m && j<n){
               if(nums1[i]>nums2[j]){
                   nums1[i]=nums2[j];
               }
               i++;
               j++;
           }
           while(j<n){
               if(nums1[i]==0){
                   nums1[i]=nums2[j];
                   
               }
               i++;
               j++;
           }
        }
    }
