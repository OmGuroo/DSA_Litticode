class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int k = n/8;
        int s = n%8;
        int i = 1;
        int ts = 0;
        while(i <= k){
            ts += i*8;
            i++;
        }    
        ts += (k+1) * s;
        return ts;
    }
}