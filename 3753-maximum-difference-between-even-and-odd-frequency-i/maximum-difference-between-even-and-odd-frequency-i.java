class Solution {
    public int maxDifference(String s) {
        HashMap<Character, Integer> fre = new HashMap<>();
        for(char c : s.toCharArray()){
            fre.put(c, fre.getOrDefault(c, 0)+1);
        }
        int maxOdd = Integer.MIN_VALUE, minEven = Integer.MAX_VALUE;
        for(char i : fre.keySet()){
            if(fre.get(i)%2 == 0){
                minEven = Math.min(minEven, fre.get(i));
            }
            else{
                maxOdd = Math.max(maxOdd, fre.get(i));
            }
        }
        return maxOdd-minEven;
    }
}