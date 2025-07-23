class Solution {
    public String sortVowels(String s) {
        int vowelCount = 0;
        for(char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                vowelCount++;
            }
        }
        if(vowelCount == 0){
            return s;
        }
        char[] arr = new char[vowelCount];
        int ind = 0;
        for(char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                arr[ind++] = ch;
            }
        }
        Arrays.sort(arr);
        StringBuilder str = new StringBuilder();
        int j = 0;
        for(int i=0;i<s.length();i++){
            if("aeiouAEIOU".indexOf(s.charAt(i)) != -1){
                str.append(arr[j++]);
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}