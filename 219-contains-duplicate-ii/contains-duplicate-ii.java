class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
            if(i>=k){
                hs.remove(nums[i-k]);
            }
        }
        return false;
    }
}