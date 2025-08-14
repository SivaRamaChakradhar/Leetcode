class Solution {
    public static boolean isUnique(String str){
        return str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2);
    }
    public String largestGoodInteger(String num) {
        int n = 0, max = 0;
        boolean uniqueString = false;
        for(int i=0;i<num.length()-2;i++){
            String str = num.substring(i, i+3);
            if(isUnique(str)){
                uniqueString = true;
                n = Integer.parseInt(str);
                max = Math.max(max, n);
            }
        }
        if(!uniqueString){
            return "";
        }
        if(max == 0){
            return Integer.toString(max)+"00";
        }
        return Integer.toString(max);
    }
}