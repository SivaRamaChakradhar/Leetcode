class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int count = 0;
        int m = pattern.length;
        for(int i=0;i<=nums.length-(m+1);i++){
            boolean isMatch = true;
            for(int k=0;k<m;k++){
                if(pattern[k] == 1 && nums[i+k+1] <= nums[i+k]){
                    isMatch = false;
                    break;
                }
                if(pattern[k] == 0 && nums[i+k+1] != nums[i+k]){
                    isMatch = false;
                    break;
                }
                if(pattern[k] == -1 && nums[i+k+1] >= nums[i+k]){
                    isMatch = false;
                    break;
                }
            }
            if(isMatch){
                count++;
            }
        }
        return count;
    }
}