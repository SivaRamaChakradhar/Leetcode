class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> fre = new HashMap<>();
        for(char ch : s.toCharArray()){
            fre.put(ch, fre.getOrDefault(ch, 0)+1);
        }
        int maxVowelCount = 0, maxConsonantCount = 0;
        for(char key: fre.keySet()){
            if(key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u'){
                maxVowelCount = Math.max(maxVowelCount, fre.get(key));
            }
            else{
                maxConsonantCount = Math.max(maxConsonantCount, fre.get(key));
            }
        }
        return maxVowelCount+maxConsonantCount;
    }
}