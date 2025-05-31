class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int divisibilityScore = 0, divisor = Integer.MAX_VALUE;
        for(int i=0;i<divisors.length;i++){
            int c = 0;
            for(int num:nums){
                if(num%divisors[i] == 0){
                    c++;
                }
            }
            if (divisibilityScore < c || (divisibilityScore == c && divisors[i] < divisor)) {
                divisibilityScore = c;
                divisor = divisors[i];
            }
        }
        return divisor;
    }
}