class Solution {
    public static void flipBinary(int[] nums, int pos){
        nums[pos] ^= 1;
        nums[pos+1] ^= 1;
        nums[pos+2] ^= 1;
    }
    public int minOperations(int[] nums) {
        int n = nums.length;
        int flipOperations = 0;
        for(int i=0;i<n-2;i++){
            if(nums[i] == 1){
                continue;
            }
            flipBinary(nums, i);
            flipOperations++;
        }
        if(nums[n-1] == 0 || nums[n-2] == 0){
            return -1;
        }
        return flipOperations;
    }
}