class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder(s);
        int n = part.length();
        int i=0;
        while(i<str.length()){
            if(i+n <= str.length() && str.substring(i, i+n).equals(part)){
                str.delete(i, i+n);
                i=0;
            }
            else{
                i++;
            }
        }
        return str.toString();
    }
}