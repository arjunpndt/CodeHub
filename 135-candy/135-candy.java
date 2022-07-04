class Solution {
    public int candy(int[] ratings) {
        int sum = 0;
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        for(int i=1;i<ratings.length;i++) {
            
            if(ratings[i] > ratings[i-1]) {
                candies[i] = 1 + candies[i-1];
            }
        }
        for(int i=ratings.length-2;i>=0;i--) {
            if(ratings[i] > ratings[i+1]) {
                candies[i] = Math.max( candies[i], 1 + candies[i+1]);
            }
        }
        
        for(int i=0;i<candies.length;i++) {
            sum+=candies[i];
        }
        
        return sum;
    }
}