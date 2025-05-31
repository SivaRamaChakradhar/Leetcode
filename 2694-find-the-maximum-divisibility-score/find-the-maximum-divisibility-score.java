class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int[] divisibilityScore = new int[divisors.length];
        for(int num :nums){
           for(int i=0;i<divisors.length;i++){
            if(num%divisors[i] == 0){
                divisibilityScore[i]++;
            }
           } 
        }

        int maxScore = 0, result = Integer.MAX_VALUE;
        for(int i=0;i<divisors.length;i++){
            if(divisibilityScore[i] > maxScore || (divisibilityScore[i] == maxScore && divisors[i] < result)){
                maxScore = divisibilityScore[i];
                result = divisors[i];
            }
        }
        return result;
    }
}