class Solution {
    public int findNumbers(int[] nums) {
        int val =0;
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            int count = 0;
            val = nums[i];
            while(val > 0){
                val = val /10;
                count++;
            }
            if (count%2 == 0){
                idx++;
            }
        }
        return idx;
    }
}