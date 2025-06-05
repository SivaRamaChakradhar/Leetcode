class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean check = true;
        for(char ch : s.toCharArray()){
            if(ch == '*' && check == true){
                count++;
            }
            else if(ch == '|' && check == true){
                check = false;
            }
            else if(ch == '|' && check == false){
                check = true;
            }
        }
        return count;
    }
}