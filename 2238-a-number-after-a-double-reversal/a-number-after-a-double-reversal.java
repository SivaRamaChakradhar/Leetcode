class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0) return true;
        if(num%10 == 0 && num > 0) return false;
        // int dup1 = num;
        // int rev1 = 0, rev2 = 0;
        // while(dup1 != 0){
        //     rev1=(rev1*10)+(dup1%10);
        //     dup1/=10;
        // }
        // int dup2 = rev1;
        // while(dup2 != 0){
        //     rev2=(rev2*10)+(dup2%10);
        //     dup2/=10;
        // }
        return true;
    }
}