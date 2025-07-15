class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n<3){
            return false;
        }
        int vowelsCount = 0, consonantCount = 0;
        for(char ch : word.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch) != -1){
                    vowelsCount++;
                }
                else{
                    consonantCount++;
                }
            }
            else if(!Character.isDigit(ch)){
                return false;
            }
        }
        return vowelsCount > 0 && consonantCount > 0;
    }
}