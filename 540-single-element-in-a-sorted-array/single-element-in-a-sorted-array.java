class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer, Integer> fre = new HashMap<>();
        for(int num:nums){
            fre.put(num, fre.getOrDefault(num, 0)+1);
        }
        int ele = 0;
        for(int key: fre.keySet()){
            if(fre.get(key) == 1){
                ele = key;
            }
        }
        return ele;
    }
}