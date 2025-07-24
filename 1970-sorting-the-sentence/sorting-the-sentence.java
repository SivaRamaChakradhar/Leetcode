class Solution {
    public String sortSentence(String s) {
        TreeMap<Integer, String> ans = new TreeMap<>();
        String[] str = s.split(" ");
        for(String st : str){
            char n = st.charAt(st.length()-1);
            int num = n-'0';
            ans.put(num, st.substring(0, st.length()-1));
        }
        StringBuilder sb = new StringBuilder();
        for(int key: ans.keySet()){
            sb.append(ans.get(key));
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}