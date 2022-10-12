package SortingImplementations;
public class FindKthSmallestElementWithQuickSort {
// 13,19,9,5,12,8,7,4,21,2,6,11

    // 4, 3 , 2, 1
     /*
       
    Time Required: 
        In Best Case: O(N); 
                            This occurs when the K-th smallest element is located in the middle of the array
        Worst Case: O(N * N) 
                            This occurs when the K-th smallest element is the largest element
                                T(N) =  T(high-pivot) +  constant
                                OR
                                T(N) = T(pivot-1 - low) + constant.
    Approach:
    ---------
    1. find the pivot in the given array, if it is equal to the K, then Return the index of the pivot as the K-th smallest element in the array.
        If we find the k-th smallest element in the first pass, then the Running time required is Linear O(N)
            This is linear because, we are calling the Partition Function only once and the partition algorithm will iterate through the given array in linear time.
            
    2. If the Pivot Index is greater than the K, then we have to search the Array from 0 to Pivot-1 locations 
        
    3. Otherwise, we have to search the array from pivot+1 to end of array.  
        
    */

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
