class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] res = new int[A.length];
        int commonCount = 0;
        Set<Integer> seen = new HashSet<>();
        for(int i=0;i<A.length;i++){
            if(seen.contains(A[i])) commonCount++;
            if(seen.contains(B[i])) commonCount++;
            if(A[i] == B[i]) commonCount++;
            seen.add(A[i]);
            seen.add(B[i]);

            res[i] = commonCount;
        }
        return res;
    }
}