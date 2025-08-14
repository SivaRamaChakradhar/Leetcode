class Solution {
    public static boolean isUnique(String str){
        return str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2);
    }
    public String largestGoodInteger(String num) {
        String max = "";
        for(int i=0;i<num.length()-2;i++){
            String str = num.substring(i, i+3);
            if(isUnique(str) && str.compareTo(max) > 0){
                max = str;
            }
        }
        return max;
    }
}