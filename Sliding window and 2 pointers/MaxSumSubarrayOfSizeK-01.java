// QUESTION LINK:- https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1 

// OPTMAL APPROACH WITH TIME COMPLEXITY :- O(N) AND SPACE COMPLEXITY:- O(1)
class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;

        while (j < arr.length) {
            sum = sum + arr[j];

            if (j - i + 1 < k)
                j++;
            else if (j - i + 1 == k) {
                max = Math.max(max, sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}