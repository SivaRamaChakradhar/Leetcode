class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            if(digits[i] == 0) continue;
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j && j!=k && i!=k && digits[k]%2==0){
                        hs.add(digits[i]*100+digits[j]*10+digits[k]);
                    }
                }
            }
        }
        return hs.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}