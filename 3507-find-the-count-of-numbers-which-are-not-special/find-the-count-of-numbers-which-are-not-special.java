class Solution {
    public boolean isp(int n){
        if(n == 1) return false;
        for(int i=2; i * i<=n; i++){
            if((n % i) == 0){
                return false;
            }
        }
        return true;
    }
    public int nonSpecialCount(int l, int r) {
        
        int k = (int)Math.sqrt(l);
        int sq = k*k;
        int tc = 0;
        while(sq <= r){
            if(isp(k)){
                if(sq >= l){
                    tc++;
                }
            }
            k++;
            sq = k*k;
        } 
        return r + 1 - (tc + l);
    }
}