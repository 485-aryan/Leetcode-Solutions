class Solution {
    public int[] findErrorNums(int[] nums) {
        int temp[] = new int[nums.length];
        int result[] = new int[2];

        for(int i:nums){
            temp[i-1]++;
        }

        for (int i=0; i<temp.length; i++){
            if(temp[i]==2){
                result[0]= i+1;
            }
            if(temp[i]==0){
                result[1]=i+1;
            }
        }

        return result;
    }
}