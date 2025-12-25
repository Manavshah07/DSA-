
// User function Template for Java
// Question Link:- https://www.geeksforgeeks.org/problems/print-table0303/1
import java.util.*;

class Solution {
    static ArrayList<Integer> getTable(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ans.add(i * n);
        }
        return ans;
    }
}