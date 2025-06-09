class Solution {
    public int minTimeToType(String word) {
        char currentChar = 'a';
        int totalTime = 0;
        for(int i=0;i<word.length();i++){
            int clockWise = Math.abs(word.charAt(i)-currentChar);
            int antiClockWise = 26-clockWise;
            totalTime += 1+Math.min(clockWise, antiClockWise);
            currentChar = word.charAt(i);
        }
        return totalTime;
    }
}