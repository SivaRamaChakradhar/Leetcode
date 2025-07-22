class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(i) == '1'){
                str.append('0');
            }
            else{
                str.append('1');
            }
        }
        return str.toString();
    }
}