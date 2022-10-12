class Solution {
   public static void main(String[] args) {
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
