import java.util.HashMap;
import java.util.Map;
// https://leetcode.com/problems/degree-of-an-array/description/
public class FindShortestSubArray {

    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        Map <Integer, Integer> first = new HashMap<>();


        int count = 0;
        int max = 0;
        int window = 0;

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            first.putIfAbsent(i, count);

            if (map.get(i) > max) {
                max = map.get(i);
                window = count - first.get(i) + 1;

            } else if (map.get(i) == max ){
                window = Math.min(window, count - first.get(i)+1);
            }
            count++;
        }
        System.out.println("map -> " + map);
        System.out.println("first  -> " + first );
        return window;
    }
}




    public static void main(String[] args) {
        int [] arg = new int[] {1, 1, 0, 9, 43, 43};
        FindShortestSubArray f = new FindShortestSubArray();
        int r = f.findShortestSubArray(arg);
        System.out.println(r);

    }

}