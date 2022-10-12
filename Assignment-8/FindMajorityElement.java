package HashMapProblems;
import java.util.HashMap;

public class FindMajorityElement {
    public static void main(String[] args) {
        int[]  nums = new int[]{3,2,3};
        System.out.println("Majority Element of the given Array is : " + findMaj(nums));

    }

    public static int findMaj(int[] nums)
    {
        int L = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<L; i++) {
            if(map.containsKey(nums[i])) {
                if(map.get(nums[i]) >= L/2)
                    return nums[i];
                map.replace(nums[i], map.get(nums[i])+1);
            }
            else
                map.put(nums[i], 1);
        }
        return nums[L-1];
    }
}
