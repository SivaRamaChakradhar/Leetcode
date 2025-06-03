class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, maxLength = 0;
        HashSet<Character> hs = new HashSet<>();
        while(end < s.length()){
            if(!hs.contains(s.charAt(end))){
                hs.add(s.charAt(end++));
                maxLength = Math.max(maxLength, end-start);
            }
            else{
                hs.remove(s.charAt(start++));
            }
        }
        return maxLength;
    }
}