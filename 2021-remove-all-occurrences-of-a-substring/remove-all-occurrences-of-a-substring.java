class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder();
        int n = part.length();
        for(char ch : s.toCharArray()){
            str.append(ch);

            if(str.length() >= n && str.substring(str.length()-n).equals(part)){
                str.delete(str.length()-n, str.length());
            }
        }
        return str.toString();
    }
}