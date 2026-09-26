class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                count++;
                if(count > max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }
        if(max >= 3){
            return true;
        } else return false;
    }
}