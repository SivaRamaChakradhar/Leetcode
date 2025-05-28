class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if((i == 0 || nums[i] != nums[i - 1] + 1) && 
                (i == nums.length - 1 || nums[i] != nums[i + 1] - 1) &&
                (i == 0 || nums[i] != nums[i - 1]) &&
                (i == nums.length - 1 || nums[i] != nums[i + 1])){
                result.add(nums[i]);
            }
        }
        return result;
    }
}