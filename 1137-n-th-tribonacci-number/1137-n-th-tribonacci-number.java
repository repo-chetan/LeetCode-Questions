class Solution {
    public int tribonacci(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return tribonacciNumber(n, map);
    }

     public static int tribonacciNumber(int target, HashMap<Integer, Integer> map) {
        
        if (target == 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 1;

      
        if (map.containsKey(target)) {
            return map.get(target);
        }

        
        int first = tribonacciNumber(target - 1, map);
        int second = tribonacciNumber(target - 2, map);
        int third = tribonacciNumber(target - 3, map);

        int result = first + second + third;

        
        map.put(target, result);

        return result;
    }

}