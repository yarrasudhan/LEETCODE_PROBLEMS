import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // sort to handle duplicates
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < n; j++) {
                int complement = -(nums[i] + nums[j]);
                if (map.containsKey(complement)) {
                    // Always add sorted triplet to avoid permutations
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet);
                    set.add(triplet);

                    // Skip duplicates for j
                    while (j + 1 < n && nums[j] == nums[j + 1]) j++;
                } else {
                    map.put(nums[j], j);
                }
            }
        }
        return new ArrayList<>(set);
    }
}
