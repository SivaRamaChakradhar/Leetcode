class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] fre = new int[101];
        for(int num : nums){
            fre[num]++;
        }
        int max = 0;
        for(int i=0;i<101;i++){
            max = Math.max(max, fre[i]);
        }
        int ans = 0;
        for(int i=0;i<101;i++){
            if(max == fre[i]){
                ans+=fre[i];
            }
        }
        return ans;
    }
}