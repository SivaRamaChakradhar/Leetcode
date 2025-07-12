class Solution {
    public String frequencySort(String s) {
        int[] fre = new int[128];
        for(char ch : s.toCharArray()){
            fre[ch]++;
        }
        StringBuilder str = new StringBuilder();
        for(int outer = 0;outer < s.length();outer++){
            int max = 0, maxIndex = 0;
            for(int i=0;i<128;i++){
                if(fre[i] > max){
                    max = fre[i];
                    maxIndex = i;
                }
            }
            if(max == 0) break;
            for(int j = 0;j<max;j++){
                str.append((char)maxIndex);
            }
            fre[maxIndex] = 0;
        }
        return str.toString();
    }
}