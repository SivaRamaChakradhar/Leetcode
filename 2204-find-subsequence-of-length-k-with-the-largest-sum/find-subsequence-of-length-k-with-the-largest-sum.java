class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int start = 0, end = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            int curr_min = Collections.min(ans);
            if(nums[i] > curr_min){
                ans.remove(Integer.valueOf(curr_min));
                ans.add(nums[i]);
            }
        }
        return ans.stream().mapToInt(i->i).toArray();
    }
}