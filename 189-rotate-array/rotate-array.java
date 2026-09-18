class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int temp[] = new int[n];
        int i=(n-k);
        int j=0;
        for(i=(n-k); i<n; i++){
            temp[j]=nums[i];
            j++;
        }
        i = 0;
         while (i < (n-k)) {
            temp[j] = nums[i];
            j++;
            i++;
        }
        for (int x = 0; x < n; x++) {
    nums[x] = temp[x];
        }
    }
}