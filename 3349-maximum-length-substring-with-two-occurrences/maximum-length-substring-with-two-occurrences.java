class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        int left = 0, maxLength = 0;
        for(int right = 0;right < s.length();right++){
            char ch = s.charAt(right);
            charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
            while(charCount.get(ch) > 2){
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar)-1);
                if(charCount.get(leftChar) == 0){
                    charCount.remove(leftChar);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}