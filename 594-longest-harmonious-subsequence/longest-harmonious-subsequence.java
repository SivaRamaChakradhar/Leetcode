class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int num:nums){
            hs.put(num, hs.getOrDefault(num, 0)+1);
        }
        int maxLength = 0;
        for(int num:hs.keySet()){
            if(hs.containsKey(num+1)){
                int currentLength = hs.get(num)+hs.get(num+1);
                maxLength = Math.max(currentLength, maxLength);
            }
        }
        return maxLength;
    }
}