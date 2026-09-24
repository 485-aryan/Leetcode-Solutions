class Solution {
    public int reverse(int x) {
        long reversedNumber = 0; 

        while (x != 0) {
            int lastDigit = x % 10;
            x = x / 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
        }

        if (reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE) {
            return 0;
        }

        int result = (int) reversedNumber;
        return result;
    }
}