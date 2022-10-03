import java.util.*;

public class Top_K_Frequent_Words {



    public static void main(String[] args) {
        String[] arr = new String[]{"priya", "bhatia", "akshay", "arpit", "priya", "arpit"};
        List<String> str = Arrays.asList(arr);
        ArrayList<String> result = new ArrayList<>();
        int k = 3;

        HashMap<String, Integer> hm = new HashMap<>();
        //  Finding the frequency of each element in the given list.
        for (int i = 0; i < str.size(); i++) {
            String current = str.get(i);
            if (hm.containsKey(current)) {
                hm.put(current, hm.get(current) + 1);
            } else {
                hm.put(current, 1);
            }
        }

        System.out.println("------------------HashMap Output-------------------");
        System.out.println(hm);
        System.out.println("---------------------HashMap Output-----------------");
        PriorityQueue<String> queue = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
        queue.addAll(hm.keySet());
       
        pq.addAll(hm.keySet());*/
        for (int i = 0; i < k; i++) {
            if (!queue.isEmpty()) {
                result.add(queue.poll());
            }
        }
        System.out.println("#############Priority Queue Output################");
        System.out.println(result);
        System.out.println("#############Priority Queue Output################");
       
        // Sorting the elements in alphabetically Ascending  Order of the result-set as there may be more than one key which has MAX Frequency.
        Collections.sort(result);
        System.out.println(result);
        System.out.println("-------------------------------------");

    }
}
