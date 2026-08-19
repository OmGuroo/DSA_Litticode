class Solution {
    public int countPrimes(int n) {
        if(n < 2){
            return 0;
        }
        boolean[] isp = new boolean[n];
        Arrays.fill(isp, true);
        isp[0] = false;
        isp[1] = false;
        for(int i=2; i*i<n; i++){
            if(isp[i]){
                for(int j=i*i; j<n; j+=i){
                    isp[j] = false;
                }
            }
        }
        int c = 0;
        for(boolean b : isp){
            if(b){
                c++;
            }
        }
        return c;
    }
}