package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        // Task implementation
        //cycle that goes through every num
        //currentIndex is for num, which is testing as first member in pair
        for (int currentIndex=0;currentIndex<nums.length;currentIndex++) {
            //cycle trying other nums (only to the right from current) as second member in pair
            for (int checkingIndex = currentIndex+1; checkingIndex < nums.length ; checkingIndex++) {
                //case, returning result if pair sum equals target
                if(nums[currentIndex]+nums[checkingIndex]==target) return new int[]{nums[currentIndex],nums[checkingIndex]};
            }
        }
        return new int[]{};
    }
}
