class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        for(String st : str){
            int n = st.charAt(st.length()-1)-'0';
            res[n-1] = st.substring(0, st.length()-1);
        }
        return String.join(" ", res);
    }
}