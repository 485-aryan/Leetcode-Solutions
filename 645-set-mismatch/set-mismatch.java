class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = i + 1;
        }
        int duplicate = 0;
        int missing = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == temp[i]) {
                    count++;
                }
            }
            if (count == 2) {
                duplicate = temp[i];
            }
            if (count == 0) {
                missing = temp[i];
            }
        }
        return new int[]{duplicate, missing};
    }
}