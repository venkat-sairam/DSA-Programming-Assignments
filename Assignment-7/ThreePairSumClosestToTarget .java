package PriorityQueue;
import java.util.*;

public class ThreePairSumClosestToTarget {

    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,-4};
        int left = 0;
        int right = arr.length - 1;
        int target = 1;
        int currentSum=0;
        
	    
	    /*
	    Approach: 
	    Repeat: N-3 times
	    	1. Fix the element at index: i 
	    	2. Two Sum approach is considered from i+1 to end-1, if found the pair, then append the Result = TwoPairOutput + Array[i] 
		
	    1. Time taken for Sorting = O( N * logn)
	    2. We  are traversing the input from i+1 to N-1 --> Time taken ~ O(N)
	    3. Repeat step-2 until N-3 times. --> Time taken = O(N^2)
	    4. OVerall time taken = o(N * logn) +  O(N^2) = O(N^2) 
	    
	   
	    */
         Arrays.sort(nums);
	    int closest = 0;
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        
	    for (int i = 0; i < n - 2; i++) {
		int j = i + 1;
		int k = n - 1;

		while (j < k) {
			int sum = nums[i] + nums[j] + nums[k];
			// If the two pair sum is equal to the target, then we are returning the output.
			if (sum == target)
				return target;
			// IF the PresentSum = nums[i] + nums[j] + nums[k] is lesser than target sum, increment the left pointer.
			else if (sum < target)
				j++;
			else
				k--;
			
			// Checkng if the currenstSum is the closest to the target or not.

			int diff = Math.abs(target - sum);
			if (diff < minDiff) {
				minDiff = diff;
				closest = sum;
			}
		}
            
            System.out.println("" + closest);
        }
    }
    
       /* Arrays.sort(arr);
        for (int i = 0; i <= arr.length-3; i++)
        {
            if (i > 0 && arr[i] ==arr[i-1])
            {
                left++;
                continue;
            }
            currentSum = arr[i];
            int TwoSumOutput =findTwoSum(arr, i+1, right, target-currentSum);
            if (TwoSumOutput !=-1)
            {
                System.out.println(currentSum+ TwoSumOutput);
            }

        }
    }

    public static int findTwoSum(int[] input, int start, int end, int target)
    {

            int left =start;
            int right = end;

            while(left < right)
            {
                if (left != start && input[left] == input[left-1])
                {
                    left++;
                    continue;

                }
                int presentSum = input[left] + input[right];
                if (presentSum== target)
                {
                    return presentSum;
                }
                else if (presentSum > target)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
            return -1;
    }
    */
}
