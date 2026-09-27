class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int original = x;
        int nn = 0;
        while(x > 0) {
            nn = nn * 10 + x % 10;
            x = x / 10;
        }
        return original == nn;
    }
}