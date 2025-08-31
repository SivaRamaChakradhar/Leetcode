class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long zeroCount = 0, ans = 0;
        for(int num: nums){
            if(num == 0){
                zeroCount++;
                ans+=zeroCount;
            }
            else{
                zeroCount = 0;
            }
        }
        return ans;
    }
}