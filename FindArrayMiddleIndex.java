public class FindArrayMiddleIndex {

        public int findMiddleIndex(int[] nums) {
            int sum = Integer.MIN_VALUE;
            int N = nums.length;

            if (nums == null || nums.length <= 0 ) { return -1; }
            int leftSum = 0;
            for (int i : nums ) {
                leftSum += i;
            }

            int count = 0;
            int rightSum = 0;

            for(int i = 0; i < N; i++ ){
                leftSum -= nums[i];
                if (leftSum == rightSum  ) {
                    System.out.println("left sum " + leftSum );
                    return i;
                }
                System.out.println("travrseing "+ leftSum);
                rightSum += nums[i];

            }
            return -1;

        }
    };