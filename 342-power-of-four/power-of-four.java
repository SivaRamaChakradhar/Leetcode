class Solution {
    public boolean isPowerOfFour(int n) {
        int num = 4, pro=1;
        for(int i=0;i<=15;i++){
            int n1 = (int)Math.pow(num, i);
            if(n == n1){
                return true;
            }
            if(n1>n){
                return false;
            }
        }
        return false;
    }
}