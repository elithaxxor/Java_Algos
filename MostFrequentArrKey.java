import java.util.*;

public class MostFrequentArrKey {
    class Solution {
        public int mostFrequent(int[] nums, int key) {
            int K = nums.length;
            Map<Integer, Integer> map = new HashMap();
            int j = 0;
            int count = 0;
            for (int i = 0; i < K; i++) {
                nums[i]=key;
                int next = nums[i+1];

                if(i > 0 && map.get(nums[i-1])!=null && map.containsKey(nums[i])) {
                    map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
                }
                j++;
            }

            Set <Integer> set = new HashSet<>(map.keySet());
            System.out.println(set);
            System.out.println(map);

            return 1;
        }
    }
}
