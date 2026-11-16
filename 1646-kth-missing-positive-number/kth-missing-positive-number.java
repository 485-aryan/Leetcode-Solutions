class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num = 1;
        int i = 0;
        int count = 0;
        while (count < k) {
            if (i < arr.length && arr[i] == num) {
                i++;
            } else {
                count++;
            }
            if (count == k) {
                return num;
            }
            num++;
        }
        return num;
    }
}

        

