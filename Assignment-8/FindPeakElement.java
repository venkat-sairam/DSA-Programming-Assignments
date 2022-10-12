package SortingImplementations;
class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        int ret = findMax(nums, 0, nums.length - 1);
        System.out.println("Peak element index = " + ret);
        System.out.println("peak element = " + nums[ret]);
    }

    public static int findMax(int[] arr, int i, int j) {
        int mid, pos;
        int finalMax1, finalMax2;
        if (i == j)
            pos = i;
        else if (i == j - 1) {
            if (arr[i] < arr[j])
                pos = j;
            else
                pos = i;
        } else {
            mid = i + (j - i) / 2;
            finalMax1 = findMax(arr, i, mid);
            finalMax2 = findMax(arr, mid + 1, j);
            if (arr[finalMax1] < arr[finalMax2])
                pos = finalMax2;
            else
                pos = finalMax1;


        }
        return pos;
    }
}
