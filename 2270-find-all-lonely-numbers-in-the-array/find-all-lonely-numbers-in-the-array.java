class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int num:nums){
            hs.put(num, hs.getOrDefault(num, 0)+1);
        }
        List<Integer> output = new ArrayList<>();
        for(int num : hs.keySet()){
            if(hs.get(num) == 1 && !hs.containsKey(num+1) && !hs.containsKey(num-1)){
                output.add(num);
            }
        }
        return output;
    }
}