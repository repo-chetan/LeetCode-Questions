class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        HashMap<Integer,Integer> map1 = new HashMap<>();
        int start =  robberRange(1, n-1, nums, map1);

        HashMap<Integer,Integer> map2 = new HashMap<>();
        int end =  robberRange(0,n-2, nums, map2);

        return  Math.max(start, end);

    }
    
    private int robberRange(int start, int end, int[] nums,HashMap<Integer, Integer> map) {
        return robberHelper(start, end, nums, map);
    }
   

    public static int robberHelper(int start,int end, int[] nums, HashMap<Integer, Integer> map)
    {
        if (start > end) return 0;

        if (map.containsKey(start)) {
            return map.get(start);
        }

        int numInclude = nums[start] + robberHelper(start+2,end,nums,map);
        int numSkip = robberHelper(start+1,end, nums,map);

        int result = Math.max(numInclude, numSkip);

        map.put(start, result);

        return result;
    }
}