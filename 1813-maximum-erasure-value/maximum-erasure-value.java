class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0, maxSum = 0, start = 0;
        for(int end = 0;end < nums.length;end++){
            while(set.contains(nums[end])){
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
            set.add(nums[end]);
            sum += nums[end];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}