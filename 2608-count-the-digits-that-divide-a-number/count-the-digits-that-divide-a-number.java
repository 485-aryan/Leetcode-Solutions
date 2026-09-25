class Solution {
    public int countDigits(int num) {
        int original = num;
        int temp = 0;
        int count = 0;
        while (num > 0) {
            temp = num % 10;
            if (temp != 0 && original % temp == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }
}