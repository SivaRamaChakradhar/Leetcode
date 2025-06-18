class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i+=3){
            if(nums[i+2]-nums[i] > k){
                return new int[0][0];
            }
            res.add(Arrays.asList(nums[i], nums[i+1], nums[i+2]));
        }
        System.out.println(res);
        int[][] resultArray = new int[res.size()][3];
        for(int i=0;i<res.size();i++){
            for(int j=0;j<3;j++){
                resultArray[i][j] = res.get(i).get(j);
            }
        }
        return resultArray;
    }
}