import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/divide-array-into-equal-pairs/solutions/
public class DivideArrayEqual {
        public boolean divideArray(int[] nums) {
            Set<Integer> seen = new HashSet<>();
            for (int num : nums) {
                System.out.print(seen);
                if (!seen.add(num)) {
                    seen.remove(num);
                }
            }
            return seen.isEmpty();
        }
    }


