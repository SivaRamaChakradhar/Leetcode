class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        for(int i=0;i<s.length();i++){
            degree += (26-(s.charAt(i)-'a'))*(i+1);
        }
        return degree;
    }
}