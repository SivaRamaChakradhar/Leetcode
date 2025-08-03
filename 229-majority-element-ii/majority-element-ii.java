class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int num:nums){
            hs.put(num, hs.getOrDefault(num, 0)+1);
        }
        int n = nums.length/3;
        for(int key : hs.keySet()){
            int val = hs.get(key);
            if(val > n){
                res.add(key);
            }
        }
        System.out.println(n);
        return res;
    }
}