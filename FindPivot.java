public class FindPivot {
    public int pivotIndex(int[] nums) {

        for (int i : nums) {
            sum += i;
        }
        System.out.println(sum);

        // mark find pivot.

        int rightSum = sum;
        int leftSum = 0;

        for (int i = 0; i < N; i++) {
            rightSum -= nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];

        }
        ;
        return -1;
    }
}
