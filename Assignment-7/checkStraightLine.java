class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        int x0 = coordinates[0][0], y0 = coordinates[0][1], 
            x1 = coordinates[1][0], y1 = coordinates[1][1];
        int dx = x1 - x0, dy = y1 - y0;
        
        /*
        Inititally computing the dy/dx i.e slope of two points.
        Later, for the remaining points, checking if the original slope is equal to the new point slope or not.
        We are traversing the given list only once. Also, the comparison of slope dy/x takes only constant time.
        Therefore constant time required for one computing the slope of two points.
        For N points, N * c Time is required.
        
        Overall, time required = O(N);
        
        */
        for (int[] co : coordinates) {
            int x = co[0], y = co[1];
            if (dx * (y - y1) != dy * (x - x1))
                return false;
        }
        return true;
    }
}
