package SortingImplementations;
class FindPeakElement {
    public static void main(String[] args) {
        
        /* We are dividing the complete array and then while conquering the small sub-problems,
        the time required to Conquer =T(N) = 2T(n/2) + constant => Using masters theorem, the time required = O(N)
                                        Here, we are comparing the values present in the left/right sub-problems.
                                        Finally returning the larger among left/right sub-problems.
        
        
        */
        int[] nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        int ret = findMax(nums, 0, nums.length - 1);
        System.out.println("Peak element index = " + ret);
        System.out.println("peak element = " + nums[ret]);
    }

    public static int findMax(int[] arr, int i, int j) {
        int mid, pos;
        int finalMax1, finalMax2;
         // small problem 
        // single element condition
        if (i == j)
            pos = i;
        //two element condition
        else if (i == j - 1) {
            if (arr[i] < arr[j])
                pos = j;
            else
                pos = i;
        } 
        
        // big problem -> n > 2
        else {
            // Divide and Conquer approach
            // Divide
            mid = i + (j - i) / 2;
            // Recursion -> Conquer - 2T(n/2)
            finalMax1 = findMax(arr, i, mid);
            finalMax2 = findMax(arr, mid + 1, j);
            // Combine
            if (arr[finalMax1] < arr[finalMax2])
                pos = finalMax2;
            else
                pos = finalMax1;


        }
        return pos;
    }
}
