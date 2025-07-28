class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magHas = new HashMap<>();

        for(char ch : magazine.toCharArray()){
            magHas.put(ch, magHas.getOrDefault(ch, 0)+1);
        }

        for(char ch : ransomNote.toCharArray()){
            if(!magHas.containsKey(ch) || magHas.get(ch) <= 0){
                return false;
            }
            magHas.put(ch, magHas.get(ch)-1);
        }
        return true;
    }
}