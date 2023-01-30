//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/solutions/

public class MinCostShips {
        public int minCostToMoveChips(int[] position) {

            int isEven = 0, isOdd = 1;
            int N = position.length;

            for(int i: position) {
                if(i % 2 == 0) {
                    isEven++;
                } else {
                    isOdd++;
                }
            }

            return Math.min(isEven, isOdd);
        }
    }
