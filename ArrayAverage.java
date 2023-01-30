// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/submissions/836913814/

public class ArrayAverage {
    class Solution {
        public double average(int[] salary) {
            int N = salary.length, sum = 0;
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            for(int i = 0; i < N; i++) {

                sum += salary[i];
                max = Math.max(salary[i], max);
                min = Math.min(salary[i], min);

            }

            return (double) (sum - max - min) / (salary.length -2 );
        }
    }

}
