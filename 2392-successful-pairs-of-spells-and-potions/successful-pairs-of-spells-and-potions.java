import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);

        int n = potions.length;
        int[] result = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {

            int spell = spells[i];

            int left = 0;
            int right = n - 1;
            int first = n;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                long product = (long) spell * potions[mid];

                if (product >= success) {
                    first = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            result[i] = n - first;
        }

        return result;
    }
}