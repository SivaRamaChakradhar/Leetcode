class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left = 0, zerosCount = 0, onesCount = 0;
        int subStringCount = 0;
        for(int right = 0;right < s.length();right++){
            if(s.charAt(right) == '0'){
                zerosCount++;
            }
            if(s.charAt(right) == '1'){
                onesCount++;
            }
            while(zerosCount > k && onesCount > k){
                if(s.charAt(left) == '0'){
                    zerosCount--;
                }
                if(s.charAt(left) == '1'){
                    onesCount--;
                }
                left++;
            }
            subStringCount+=(right-left+1);
        }
        return subStringCount;
    }
}