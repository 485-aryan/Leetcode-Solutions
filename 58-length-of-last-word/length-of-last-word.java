class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int len = s.length();
        for(int i = (len-1); i>=0; i--){
            if(s.charAt(i) != ' '){
                count++;
            } else {
                if(count > 0){
                    return count;
                }
            }
        } 
        return count;
    }
}