// User function Template for Java
// Question Link:- https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int a = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;

            int mul = rem * rem * rem;
            sum += mul;
        }
        if (sum == a)
            return true;
        return false;
    }
}