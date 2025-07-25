class Solution {
    public int maxSum(int[] nums) {
        boolean allNegative = true;
        int maxValue = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n >= 0) {
                allNegative = false;
            }
            if (n > maxValue) {
                maxValue = n;
            }
        }
        if (allNegative)
            return maxValue;
        Set<Integer> ans = new HashSet<>();
        for(int num:nums){
            ans.add(num);
        }
        int totalSum = 0;
        for(int num:ans){
            if(num>0){
                totalSum += num;
            }
        }
        return totalSum;
    }
}