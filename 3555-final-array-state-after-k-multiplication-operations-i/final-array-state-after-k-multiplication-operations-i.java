class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int minIndex = findIndexOfFirstMin(nums);
            nums[minIndex] = nums[minIndex]*multiplier;
        }
        return nums;
    }
    public static int findIndexOfFirstMin(int[] nums){
        int minIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < nums[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
}