class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex = 0;
        int maxIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[minIndex] > nums[i]){
                minIndex = i;
            }
            if(nums[maxIndex] < nums[i]){
                maxIndex = i;
            }
        }
        int fromFront = Math.max(minIndex, maxIndex)+1;
        int fromBack = nums.length-Math.min(minIndex, maxIndex);
        int fromBothSides = Math.min(minIndex, maxIndex)+1+nums.length-Math.max(minIndex, maxIndex);
        return Math.min(fromFront, Math.min(fromBack, fromBothSides));
    }
}