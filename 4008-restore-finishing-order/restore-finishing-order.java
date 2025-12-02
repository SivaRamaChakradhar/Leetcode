class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res = new int[friends.length];
        int ind = 0;
        boolean[] isFriend = new boolean[order.length+1];
        for(int f : friends){
            isFriend[f] = true;
        }
        for(int id: order){
            if(isFriend[id]){
                res[ind++] = id;
            }
        }
        return res;
    }
}