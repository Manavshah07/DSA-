// User function Template for Java
// Question Link:- https://www.geeksforgeeks.org/problems/count-squares3649/1
class Solution {
    static int countSquares(int n) {
        // code here
        return (int) Math.sqrt(n - 1);
    }
}

// OR

// class Solution {
// static int countSquares(int n) {
// // code here
// int count = 0;
// for(int i=1; i*i<n; i++) {
// count++;
// }
// return count;
// }
// }