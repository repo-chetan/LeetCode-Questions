Max Sum without adjacents solution Dynamic programming

Given an array arr containing positive integers. Find the maximum sum of any possible subsequence such that no two numbers in the subsequence should be adjacent in array arr.

Input: arr[] = [5, 5, 10, 100, 10, 5]
Output: 110
Explanation: If you take indices 0, 3 and 5, then = 5+100+5 = 110.

Input: arr[] = [3, 2, 7, 10]
Output: 13
Explanation: 3 and 10 forms a non continuous subsequence with maximum sum.

Input: arr[] = [9, 1, 6, 10]
Output: 19
Explanation: 9 and 10 forms a non continuous subsequence with maximum sum.

Constraints:
1 ≤ arr.size() ≤ 10^5
1 ≤ arri ≤ 10^5