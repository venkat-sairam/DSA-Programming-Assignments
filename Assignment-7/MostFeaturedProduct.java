package PriorityQueue;
import java.util.*;

public class MostFeaturedProduct {
    public static void main(String[] args) {
        String[] arr = new String[]{"yellowShirt", "redHat", "blackShirt", "bluePants", "redHat","pinkHat", "blackShirt", "yellowShirt", "greenPants", "greenPants", ""};
        List<String> str = Arrays.asList(arr);
        ArrayList<String> result = new ArrayList<>();
        for (String s: str)
        {
            System.out.println(s);
        }

        HashMap<String, Integer> hm = new HashMap<>();

        //  Finding the frequency of each element in the given list.
        // The total time taken to create a hash map with frequency of each element = O(n)
        // ime taken = O(N) since we are traversing the entire input once and checking whether the hash map contains element or not . So, the time taken is linear
        for (int i = 0; i < str.size();i++)
        {
            String current = str.get(i);

            if(hm.containsKey(current))
            {
                hm.put(current, hm.get(current) + 1);
            }else
            {
                hm.put(current, 1);
            }
        }

        // Finding the MAX Frequency among the given elements
        // Time taken = O(N) since we are traversing the entire input once. So, the time taken is linear
        int maxfreq=0;
        for (String key : hm.keySet())
        {
            int currentFreq = hm.get(key);
            maxfreq= Math.max(currentFreq, maxfreq);

        }
        // Finding the Element(s) which has maximum frequency.
        // Time taken = O(N) since we are traversing the entire input once for comparing the maximum frequency amng all the given elements. So, the time taken is linear
        for (String key : hm.keySet())
        {
            if(hm.get(key)==maxfreq) {
                result.add(key);
            }
        }

       // Sorting the elements in alphabetically Ascending  Order of the result-set as there may be more than one key which has MAX Frequency.
        // Best sort algorithm takes O(nlogn) time even if it is Heap Sort. 
        Collections.sort(result);
        System.out.println("-------------------------------------");
        System.out.println(result);
        
        /*
        Overall time:
        -------------
        1. Finding the frequency of each element in the given list: O(N)
        2. Finding the MAX Frequency among the given elements : O(N)
        3. inding the Element(s) which has maximum frequency: O(N)
        4. Sorting the elements in alphabetically Ascending  Order : O(n * logn)
        
        Finally Time taken = O(N) + O(N) + O(N) + O(N* logn)
                            = O(N* logn)
        
        
        
        */
    }
}
