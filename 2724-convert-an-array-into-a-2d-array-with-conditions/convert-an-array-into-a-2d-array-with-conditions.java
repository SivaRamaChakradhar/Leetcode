class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> fre = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int num: nums){
            fre.put(num, fre.getOrDefault(num, 0)+1);
        }

        int maxFreq = Collections.max(fre.values());
        for(int i=0;i<maxFreq;i++)
            res.add(new ArrayList<>());

        for(int key : fre.keySet()){
            int val = fre.get(key);
            for(int i=0;i<val;i++)
                res.get(i).add(key);
        }
        return res;
    }
}