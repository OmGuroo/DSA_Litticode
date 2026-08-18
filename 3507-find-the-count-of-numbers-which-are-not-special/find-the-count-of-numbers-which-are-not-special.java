class Solution {

    public int nonSpecialCount(int l, int r) {
        int k =(int) Math.sqrt(r);
        boolean[] isp = new boolean[k+1];
        Arrays.fill(isp, true);

        isp[0] = false;
        isp[1] = false;

        for(int i=2; i<=k; i++){
            if(isp[i]){
                for(int j = i*i; j <= k; j+=i){
                    isp[j] = false;
                }
            }
        }
        int tc = 0;
        int i =(int) Math.ceil(Math.sqrt(l));
        for(; i*i<= r; i++){
            if(isp[i]){
                tc++;
            }
        }
        return r + 1 - (tc + l);
        }
}




    // public boolean isp(int n){
    //     if(n == 1) return false;
    //     for(int i=2; i * i<=n; i++){
    //         if((n % i) == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }