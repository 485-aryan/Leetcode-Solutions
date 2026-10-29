class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int maxxmaal = 0;
        for(int i =0; i<m; i++){
            int maal = 0;
            for(int j=0; j<n; j++){
                maal = maal + accounts[i][j];
            }
            if (maal > maxxmaal){
                maxxmaal = maal;
            }
        }
        return  maxxmaal;
    }
}