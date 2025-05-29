class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int waterCapacity = capacity;
        int steps = 0;
        for(int i=0;i<plants.length;i++){
            if(waterCapacity >= plants[i]){
                waterCapacity-=plants[i];
                steps++; 
            }
            else{
                steps += (2*i)+1;
                waterCapacity = capacity-plants[i];
            }
        }
        return steps;
    }
}