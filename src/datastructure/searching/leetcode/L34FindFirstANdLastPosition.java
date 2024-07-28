package src.datastructure.searching.leetcode;

import java.util.Arrays;

/*
Given an array of integers nums sorted in non-decreasing order,
find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
 */
public class L34FindFirstANdLastPosition {
    public static void main(String[] args) {
        int [] arr={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,8)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        return new int[]{start,end};
    }

    static int search(int [] nums,int target,boolean firstStartIndex){
        int start=0;
        int ans=-1;
        int end=nums.length-1;

        while (start<=end){
            int mid=start+(end-start )/2;
            if (target>nums[mid]){
                start=mid+1;
            } else if (target<nums[mid]) {
                end=mid-1;
            }else {
                ans= mid;
                if (firstStartIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
