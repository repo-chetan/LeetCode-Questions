import java.util.HashMap;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = cost.length;
        // You can start at step 0 or step 1
        return Math.min(climb(0, cost, n, map), climb(1, cost, n, map));
    }

    public static int climb(int currentStair, int[] cost, int targetStair, HashMap<Integer, Integer> map) {
        if (currentStair > targetStair) return 1000;   // invalid path, large penalty
        if (currentStair == targetStair) return 0;     // reached the top, no extra cost

        // Memoization check
        if (map.containsKey(currentStair)) {
            return map.get(currentStair);
        }

        // Recursive relation: pay current cost + min(next steps)
        int oneStep = cost[currentStair] + climb(currentStair + 1, cost, targetStair, map);
        int twoStep = cost[currentStair] + climb(currentStair + 2, cost, targetStair, map);

        int result = Math.min(oneStep, twoStep);

        // Store in map
        map.put(currentStair, result);

        return result;
    }

}
  
