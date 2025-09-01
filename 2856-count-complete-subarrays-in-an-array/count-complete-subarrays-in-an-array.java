class Solution {
    public int countCompleteSubarrays(int[] nums){
        int noOfSubarrays = 0;
        Set<Integer> distinctElements = new HashSet<>();
        for(int num:nums){
            distinctElements.add(num);
        }
        int left = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int right = 0;right<nums.length;right++){
            countMap.put(nums[right], countMap.getOrDefault(nums[right], 0)+1);
            while(countMap.size() == distinctElements.size()){
                noOfSubarrays += (nums.length-right);
                countMap.put(nums[left], countMap.get(nums[left])-1);
                if(countMap.get(nums[left]) == 0){
                    countMap.remove(nums[left]);
                }
                left++;
            }
        }
        return noOfSubarrays;
    }
}