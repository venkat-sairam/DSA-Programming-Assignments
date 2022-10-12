class Solution {
   public static void main(String[] args) {
      
      /*
      
      This problem is solved using Quick Sort due to the condition inplace sorting is required.
      As quick sort sorts the given input in-place even if all the elements are equal/sorted order.
      
      Time Complexity: T(N) = 2 T(N/2) + O(N)
      ----------------
      Best Case: 
           O(N * logN) using the masters theorem
           a = 2, b = 2, K = 1, p = 0
           and K = loga/logb
           also, p > -1 => Case-3
           Time = O(n^(loga/logb) (logn)^(p+1))
                = O(n * logn)
      Worst Case:
      -----------
            If the input is sorted or equal elements, then 
               T(N) = T(N-1) + O(N)
                    = T(N-2) + N-1 + N 
                    = T(N-3) + N-2 + N-1 + N 
                    = T(N-4) + N-3 + N-2 + N-1 + N
                    .
                    .
                    = T(N-K) + (N-K+1) + (N-K+2) + .....+ N
                    = T(1) + 1 + 2 + 3 + ...+ N [Put K= N]
                    = N* (N+1))/2
                    = O(N*N)
                    
                 
                  
                              
                            
         
         
         */
        int[] arr = new int[]{2,0,2,1,1,0};
       quickSort(arr, 0, arr.length-1);
      System.out.println("Sorted Colors: " + arr);
   }
   

private static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);

        }
    }

    public  static int partition(int[]a, int p, int r)
    {
        int i = p-1;
        int x = a[r];
        int  j=0;

        for( j = p; j < r; j++)
        {
            if (a[j] <= x)
            {
                i = i +1;
                swap(a, i, j);
            }
        }
        swap(a, i+1, r);
        return i+1;

    }

    private static void swap(int[] a, int i, int j)
    {
        int temp = 0;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
