package ru.sibgatyllintdanil.firstmissingpositive;

public class MissingPositive {

    /*
    Given an unsorted integer array nums, find the smallest missing positive integer.

Follow up: Could you implement an algorithm that runs in O(n) time and uses constant extra space.?

Example 1:

Input: nums = [1,2,0]
Output: 3
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
     */

    public static void main(String[] args){

        int[] nums = {3,4,-1,1,2,5,6,98,54,4,1,8,9};

        System.out.println(firstMissingPositive(nums));

    }

    static int firstMissingPositive(int[] nums) {
        boolean isFind =false;
        int minPositiv =1;
        while (!isFind){
            for(int i=0;i< nums.length;i++){
                if (nums[i]==minPositiv){
                    minPositiv++;
                    break;
                }
                if (i==nums.length-1){
                    isFind=true;
                }
            }
        }
        return minPositiv;
    }


}
