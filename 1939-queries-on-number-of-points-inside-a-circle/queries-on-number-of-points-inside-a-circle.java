class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] arr = new int[queries.length];
        int c = 0, ind=0;
        for(int i=0;i<queries.length;i++){
            c = 0;
            for(int j=0;j<points.length;j++){
                double d = Math.pow((queries[i][0]-points[j][0]), 2)+Math.pow((queries[i][1]-points[j][1]), 2);
                if(Math.sqrt(d) <= queries[i][2]){
                    c++;
                }
            }
            arr[ind++] = c;
        }
        return arr;
    }
}