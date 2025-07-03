class Solution {
    public int averageValue(int[] nums) {
        int evenSum = 0, n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]%3==0){
                evenSum+=nums[i];
                n++;
            }
        }
        return (n>0)?(int)(evenSum/n):0;
    }
}