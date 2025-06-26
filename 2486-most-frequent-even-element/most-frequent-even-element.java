class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> fre = new HashMap<>();
        for(int num: nums){
            if(num%2 == 0)
                fre.put(num, fre.getOrDefault(num, 0)+1);
        }
        int maxCount = 0;
        int mostFrequency = -1;
        for(int key: fre.keySet()){
            int count = fre.get(key);
            if(maxCount < count || (maxCount == count && mostFrequency > key)){
                mostFrequency = key;
                maxCount = count;
            }
        }
        return mostFrequency;
    }
}