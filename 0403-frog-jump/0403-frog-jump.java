class Solution {
    public boolean canCross(int[] stones) {
        if (stones[1] != 1)
            return false;

        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < stones.length; i++) {
            indexMap.put(stones[i], i);
        }

        HashMap<Integer, Boolean> map = new HashMap<>();
        return jump(1, 1, stones, indexMap, map);

        

        
    }

 public static boolean jump(int currentStone, int lastJump,
                               int[] stones,
                               HashMap<Integer, Integer> indexMap,
                               HashMap<Integer, Boolean> memo) {
        if (currentStone == stones.length - 1) return true;

        int key = currentStone * (stones.length + 1) + lastJump;

        if (memo.containsKey(key))
            return memo.get(key);

        boolean firstJump = tryJump(currentStone, lastJump - 1, stones, indexMap, memo);
        boolean secondJump = tryJump(currentStone, lastJump, stones, indexMap, memo);
        boolean thirdJump = tryJump(currentStone, lastJump + 1, stones, indexMap, memo);

        boolean result = firstJump || secondJump || thirdJump;

        memo.put(key, result);

        return result;
        }

        private static boolean tryJump(int currentStone, int jumpSize,
                                   int[] stones,
                                   HashMap<Integer, Integer> indexMap,
                                   HashMap<Integer, Boolean> memo) {

        if (jumpSize <= 0)
            return false;

        int nextStonePosition = stones[currentStone] + jumpSize;

        if (!indexMap.containsKey(nextStonePosition))
            return false;

        int nextStoneIndex = indexMap.get(nextStonePosition);

        return jump(nextStoneIndex, jumpSize, stones, indexMap, memo);
    }
}