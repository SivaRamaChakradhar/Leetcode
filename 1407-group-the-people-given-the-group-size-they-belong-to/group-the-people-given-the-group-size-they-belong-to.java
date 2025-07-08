class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> teamSize = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            int size = groupSizes[i];
            teamSize.putIfAbsent(size, new ArrayList<>());
            teamSize.get(size).add(i);
            if(teamSize.get(size).size() == size){
                res.add(new ArrayList<>(teamSize.get(size)));
                teamSize.get(size).clear();
            }
        }
        return res;
    }
}