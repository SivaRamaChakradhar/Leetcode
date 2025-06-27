class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int num:nums){
            ArrayList<Integer> temp = new ArrayList<>();
            while(num != 0){
                temp.add(0, num%10);
                num/=10;
            }
            res.addAll(temp);
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}