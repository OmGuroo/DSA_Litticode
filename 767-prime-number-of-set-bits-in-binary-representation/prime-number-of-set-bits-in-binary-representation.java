class Solution {
    public boolean isp(int k){
        if(k==1) return false;
        for(int i=2; i<=k/2; i++){
            if(k % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public int countPrimeSetBits(int left, int right) {
        int ts = 0;
        while(left <= right){
            int l = left;
            int c = 0;
            while(l != 0){
                if((l & 1) == 1){
                    c++;
                }
                l >>= 1;
            }
            if(isp(c)){
                ts++;
            }
            left++;
        }
        return ts;
    }
}