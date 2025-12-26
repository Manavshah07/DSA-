
// Question Link:- https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1

import java.util.*;

class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        // HERE WE ARE GOING TILL SQRT(n) AS WE CAN REDUCE THE TLE EXCEED AND ALSO WE
        // ARE STORING IN THE PAIR
        /**
         * FOR 20 --> 4 WHERE MY LOOP WILL GO AND WHEN IT STARTS WITH I THEN IT GENERATE
         * OTHER PAIRS
         * 1 2 4 5 10 20
         */
        for (int i = 1; i <= Math.sqrt(n); i++) {
            //
            if (n % i == 0) {
                // If BOTH divisors are equal, add only once LIKE 10/10 = 1 SO ADD 10 ONLY ONCE
                if (n / i == i) {
                    ans.add(i);
                }
                // Otherwise add both Pair (1 & 20) IF N is 20
                else {
                    ans.add(i);
                    ans.add(n / i);
                }
            }
        }
        Collections.sort(ans);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}