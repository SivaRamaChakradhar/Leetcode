class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0, minCount = Integer.MAX_VALUE;
        int whiteCount = 0;
        for(int right = 0;right < blocks.length();right++){
            if(blocks.charAt(right) == 'W'){
                whiteCount++;
            }            
            if(right-left+1 == k){
                minCount = Math.min(minCount, whiteCount);
                if(blocks.charAt(left) == 'W'){
                    whiteCount--;
                }
                left++;
            }
        }
        return minCount;
    }
}