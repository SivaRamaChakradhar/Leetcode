class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        for(char c : p.toCharArray()){
            pFreq[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
            windowFreq[s.charAt(i)-'a']++;

            if(i>=p.length()){
                windowFreq[s.charAt(i-p.length())-'a']--;
            }

            if(Arrays.equals(windowFreq, pFreq)){
                res.add(i-p.length()+1);
            }
        }
        return res;
    }
}