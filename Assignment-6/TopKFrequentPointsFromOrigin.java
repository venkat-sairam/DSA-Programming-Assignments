package PriorityQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentPointsFromOrigin {

    private static int getDistance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
    public static void main(String[] args) {
    //    int[][] points = new int[][]{{1, 3}, {-2, 2}};
        int[][] points = new int[][]{{3,3},{5,-1},{-2,4}};
        int k =2;


         PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
             @Override
             public int compare(int[] o1, int[] o2) {
                 return getDistance(o2) - getDistance(o1);
             }
        });
        for (int x = 0; x < points.length; x++)
        {
            pq.add(points[x]);
            if (pq.size() > k)
                pq.poll();
        }

        int[][] result = new int[k][2];
        while (k > 0)
            result[--k] = pq.poll();
        System.out.println("++++++++++++++++++++++++++++");
        for (int[] row: result)
        {
            for(int col: row)
            {
                System.out.print(col + " ");
            }
            System.out.println(" ");
        }
        System.out.println("++++++++++++++++++++++++++++");
      /*  while (pq.size()>0)
        {
           for (int x: pq.peek())
           {
               System.out.print( x+ " ");

           }
           pq.remove();
        }
*/


    }
}
