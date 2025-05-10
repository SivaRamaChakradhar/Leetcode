class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] arr = new int[n];
        int count = 0, operations = 0;
        for(int i=0;i<n;i++){
            arr[i] = operations;
            count += boxes.charAt(i) == '1' ? 1:0;
            operations += count;
        }
        count = 0;
        operations = 0;
        for(int i=n-1;i>=0;i--){
            arr[i] += operations;
            count += boxes.charAt(i) == '1' ? 1:0;
            operations += count;
        }
        return arr;
    }
}