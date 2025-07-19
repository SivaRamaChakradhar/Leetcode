class Solution {
    public int countTriplets(int[] arr) {
        int tripletsCount = 0;
        for(int i=0;i<arr.length;i++){
            int val = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if((val^=arr[j])==0){
                    tripletsCount+=(j-i);
                }
            }
        }
        return tripletsCount;
    }
}