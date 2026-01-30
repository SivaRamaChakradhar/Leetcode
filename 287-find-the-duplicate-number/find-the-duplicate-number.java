class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> hs = new HashMap<>();
        for(int num: nums){
            hs.put(num, hs.getOrDefault(num, 0)+1);
        }

        for(int key: hs.keySet()){
            if(hs.get(key) > 1){
                return key;
            }
        }
        return -1;
    }
}