class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int brokenKeysCount = 0;
        Set<Character> brokenKeys = new HashSet<>();
        for(char ch : brokenLetters.toCharArray()){
            brokenKeys.add(ch);
        }
        String[] words = text.split(" ");
        for(String word: words){
            boolean canType = true;
            for(char ch : word.toCharArray()){
                if(brokenKeys.contains(ch)){
                    canType = false;
                    break;
                }
            }
            if(canType){
                brokenKeysCount++;
            }
        }
        return brokenKeysCount;
    }
}