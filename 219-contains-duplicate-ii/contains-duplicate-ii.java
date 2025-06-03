class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hs.containsKey(nums[i])){
                hs.put(nums[i], i);
            }
            else{
                int ind = hs.get(nums[i]);
                hs.put(nums[i], i);
                if(Math.abs(ind-i) <= k){
                    return true;
                }
            }
        }
        return false;
    }
}