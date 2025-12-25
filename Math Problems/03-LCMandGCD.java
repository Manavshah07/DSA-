// Question Link:- https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int on1 = a;
        int on2 = b;
        while (a % b != 0) {
            int rem = a % b;
            a = b; //
            b = rem;
        }
        int gcd = b;
        int lcm = (on1 * on2) / gcd;

        return new int[] { lcm, gcd };
    }
}