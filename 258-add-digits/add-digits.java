class Solution {
    public int addDigits(int num) {
        int temp = 0;
        while (num > 9){
            temp = num%10;
            num = num/10;
            num = temp + num;
        }
        return num;
    }
}