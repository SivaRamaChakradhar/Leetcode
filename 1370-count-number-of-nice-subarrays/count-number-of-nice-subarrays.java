class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int noOfNiceSubArrays = 0;
        int left = 0, oddCount = 0, prefixCount = 0;
        for(int right = 0;right < nums.length;right++){
            if(nums[right]%2 == 1){
                oddCount++;
                prefixCount = 0;
            }
            while(oddCount == k){
                prefixCount++;
                if(nums[left]%2 == 1){
                    oddCount--;
                }
                left++;
            }
            noOfNiceSubArrays += prefixCount;
        }
        return noOfNiceSubArrays;
    }
}