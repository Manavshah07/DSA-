// User function Template for Java
// Question Link:- https://www.geeksforgeeks.org/problems/count-digits5716/1
class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count = 0;
        int a = n;
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;

            if (rem != 0 && a % rem == 0)
                count++;
        }
        return count;
    }
}