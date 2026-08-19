class Solution {
    public int countPrimes(int n) {
        if(n < 2){
            return 0;
        }
        boolean[] isp = new boolean[n];

        isp[0] = true;
        isp[1] = true;
        for(int i=2; i*i<n; i++){
            if(!isp[i]){
                for(int j=i*i; j<n; j+=i){
                    isp[j] = true;
                }
            }
        }
        int c = 0;
        for(boolean b : isp){
            if(!b){
                c++;
            }
        }
        return c;
    }
}