class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> fre = new HashMap<>();
        for(char ch : s.toCharArray()){
            fre.put(ch, fre.getOrDefault(ch, 0)+1);
        }
        int maxVowelCount = 0, maxConsonantCount = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        for(char key: fre.keySet()){
            if(vowels.contains(key)){
                maxVowelCount = Math.max(maxVowelCount, fre.get(key));
            }
            else{
                maxConsonantCount = Math.max(maxConsonantCount, fre.get(key));
            }
        }
        return maxVowelCount+maxConsonantCount;
    }
}