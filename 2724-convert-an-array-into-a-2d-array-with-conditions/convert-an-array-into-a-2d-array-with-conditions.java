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


        System.out.println(fre.entrySet());
        for(Map.Entry<Integer, Integer> entry: fre.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            for(int i=0;i<count;i++)
                res.get(i).add(num);
        }
        return res;
    }
}