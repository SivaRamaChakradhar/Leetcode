class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0, count = 0, sum = 0;
        int target = k*threshold;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if(sum >= target){
            count++;
        }
        for(int i=k;i<arr.length;i++){
            sum = sum-arr[i-k]+arr[i];
            if(sum >= target){
                count++;
            }
        }
        return count;
    }
}