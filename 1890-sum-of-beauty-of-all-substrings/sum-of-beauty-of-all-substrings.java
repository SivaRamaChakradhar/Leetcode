class Solution {
    public int beautySum(String s) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            int[] fre = new int[26];
            for(int j=i;j<s.length();j++){
                fre[s.charAt(j)-'a']++;
                int maxFre = 0;
                int minFre = Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(fre[k] > 0){
                        maxFre = Math.max(maxFre, fre[k]);
                        minFre = Math.min(minFre, fre[k]);
                    }
                }
                sum += (maxFre-minFre);
            }
        }
        return sum;
    }
}