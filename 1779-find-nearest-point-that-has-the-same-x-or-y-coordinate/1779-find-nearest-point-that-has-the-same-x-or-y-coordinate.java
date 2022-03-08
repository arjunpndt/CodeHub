class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
       int temp=-1,min=Integer.MAX_VALUE;
        
        for(int i=0;i<points.length;i++){
            if(x==points[i][0] || y==points[i][1]){
               int distance = Math.abs(x-points[i][0]) + Math.abs(y-points[i][1]);
                if(distance<min){
                    min=distance;
                    temp=i;
                }
            }
        }
        return temp;
    }
}