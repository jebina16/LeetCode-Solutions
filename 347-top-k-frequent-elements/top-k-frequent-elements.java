import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count the frequency of each number
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a Min Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );

        // Step 3: Add numbers to the Heap
        for (int num : map.keySet()) {
            pq.offer(num);

            // Keep only K elements
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 4: Store the answer
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}