
// QUESTION LINK:- https://leetcode.com/problems/fruit-into-baskets/ 
// BRUTE FORCE : TIME COMPLEXITY:-O(N^2) AND SPACE COMPLEXITY:- O(N) BECAUSE USING HASHSET
import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            // starting index & using HashSet for storing unique characters
            HashSet<Integer> hset = new HashSet<>();
            for (int j = i; j < n; j++) {
                // Adding all the furits into the hashet
                hset.add(fruits[j]);

                // if unique character size becomes more than 2 then will skip the line
                if (hset.size() > 2)
                    break;

                ans = Math.max(ans, j - i + 1);
            }
        }
        return ans;
    }
}

// OPTIMAL APPROACH:-