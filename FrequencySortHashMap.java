import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FrequencySortHashMap {
        public int[] frequencySort(int[] nums) {
            int N = nums.length;
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            int [] freq = new int [10000] ;
            int count = 0, maxFreq = 0;



            for(int i: nums) {
                map.put(i, map.getOrDefault(i, 0)+1);
            }
            System.out.println("map - > " + map);
            List<Integer> res = new ArrayList(map.keySet());

            Collections.sort(res, (a, b) -> {
                if(map.get(a) == map.get(b)) {
                    return b-a;
                } else {
                    return map.get(a) - map.get(b);
                }
            });


            int idx = 0;
            int [] res2 = new int[N];

            for(int i : res) {
                for(int j = 0; j < map.get(i);  j++ ) {
                    res2[idx] = i;
                    idx++;
                }
            }


            return res2;
        }


        public void swap(int[] arr, int curr, int next) {
            while (arr[curr] < arr[next]) {
                int temp = arr[curr];
                arr[curr] = arr[next];
                arr[next] = temp;}
            System.out.print(arr[next]);
        }

        public void reverse  ( int [] arr, int start, int end) {
            while (start > end) {
                start ++;
                end--;

            }
        }
    }
}
