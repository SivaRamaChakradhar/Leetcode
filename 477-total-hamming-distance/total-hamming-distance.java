class Solution {
    public int totalHammingDistance(int[] nums) {
        int totalDistance = 0;
        for(int i=0;i<31;i++){
            int count1 = 0;
            for(int num:nums){
                if(((num >> i) & 1) == 1) {
                    count1+=1;
                } 
            }
            int count0 = nums.length-count1;
            totalDistance += count1*count0;
        }
        return totalDistance;
    }
}