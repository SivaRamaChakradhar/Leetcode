class Solution {
    public int[] transformArray(int[] nums) {
        int st = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                nums[st++] = 0;
            }
            else{
                nums[st++] = 1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}