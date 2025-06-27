class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int num:nums){
            String str = Integer.toString(num);
            int i = 0;
            while(i< str.length()){
                res.add(Character.getNumericValue(str.charAt(i)));
                i++;
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}