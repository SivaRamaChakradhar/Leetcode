class Solution {
    public int waysToMakeFair(int[] nums) {
        int evenSum = 0, oddSum = 0, leftEven = 0, leftOdd = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) evenSum+=nums[i];
            else oddSum+=nums[i];
        }
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) evenSum-=nums[i];
            else oddSum-=nums[i];

            if(leftEven+oddSum == leftOdd+evenSum) count++;

            if(i%2==0) leftEven+=nums[i]; 
            else leftOdd += nums[i];
        }
        return count;
    }
}