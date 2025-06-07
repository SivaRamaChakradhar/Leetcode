class Solution {
    public int longestBeautifulSubstring(String word) {
        int maxLen = 0, currLen = 0, vowelCount = 0;
        char prev = ' ';
        for(char c : word.toCharArray()){
            if(c == prev || (c=='a' && prev == ' ') || c>prev){
                currLen++;
                if(c!=prev) vowelCount++;
            }
            else{
                currLen = (c=='a') ? 1:0;
                vowelCount = (c=='a') ? 1:0;
            }
            if(vowelCount == 5) maxLen = Math.max(maxLen, currLen);
            prev = c;
        }
        return maxLen;
    }
}