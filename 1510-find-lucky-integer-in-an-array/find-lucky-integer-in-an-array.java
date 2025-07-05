class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> fre = new HashMap<>();
        for(int num:arr){
            fre.put(num, fre.getOrDefault(num, 0)+1);
        }
        int largestLuckyValue = -1;
        for(int key: fre.keySet()){
            if(key == fre.get(key) && largestLuckyValue < key){
                largestLuckyValue = key;
            }
        }
        return largestLuckyValue;
    }
}