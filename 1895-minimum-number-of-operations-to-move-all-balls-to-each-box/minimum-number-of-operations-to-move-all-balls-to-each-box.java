class Solution {
    public int[] minOperations(String boxes) {
        int[] arr = new int[boxes.length()];
        int count = 0, operations = 0;
        for(int i=0;i<boxes.length();i++){
            arr[i] = operations;
            count += boxes.charAt(i) == '1' ? 1:0;
            operations += count;
        }
        count = 0;
        operations = 0;
        for(int i=boxes.length()-1;i>=0;i--){
            arr[i] += operations;
            count += boxes.charAt(i) == '1' ? 1:0;
            operations += count;
        }
        return arr;
    }
}