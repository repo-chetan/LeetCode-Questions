class Solution {
    public int fib(int n) {
    HashMap<Integer,Integer> map = new HashMap<>();
    return finbonacciNumber(n, map);

        
    }
    public static int finbonacciNumber(int target, HashMap<Integer, Integer> map)
    {
        if(target==0) return 0;
        if(target==1) return 1;

        if(map.containsKey(target))
        {
            return map.get(target);
        }

        int result = finbonacciNumber(target-1,map)+finbonacciNumber(target-2,map);
        map.put(target,result);

        return result;

    }
}