class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String> ans = new ArrayList<>();
        if(groups.length==1){
            ans.add(words[0]);
            return ans;
        }
        for(int i=0;i<groups.length-1;i++){
            if(groups[i] != groups[i+1]){
                ans.add(words[i]);
            }
            else{
                continue;
            }
        }
        ans.add(words[groups.length-1]);
        return ans;
    }
}