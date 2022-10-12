package SortingImplementations;
public class FindKthSmallestElementWithQuickSort {
// 13,19,9,5,12,8,7,4,21,2,6,11

    // 4, 3 , 2, 1

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,4,5,6};
        int v =1;

        int index = quickSort(arr, 0, arr.length-1, v);
        if (index != -1) {
            System.out.print("K-th smallest element: " + " = " + arr[index]);

        }
    }
    private static int quickSort(int[] arr, int low, int high, int key)
    {
        if (low <= high)
        {
            int pivot = partition(arr, low, high);
        //    System.out.println("pivot = " + pivot);
            if (pivot+1 == key) return pivot;
            else if (pivot+1 > key)
            {
                return quickSort(arr, low, pivot-1, key);
            }
            else
            {
               return  quickSort(arr, pivot+1, high, key);
            }
        }
        return -1;
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
