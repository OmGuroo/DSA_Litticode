class Solution {


    public int countPrimeSetBits(int left, int right) {
        Set<Integer> hs = Set.of(2, 3, 5, 7, 11, 13, 17, 19, 23);

        int ts = 0;
        while(left <= right){
            int l = left;
            int c = Integer.bitCount(l);

            if(hs.contains(c)){
                ts++;
            }
            left++;
        }
        return ts;
    }
}

    // public boolean isp(int k){
    //     if(k==1) return false;
    //     for(int i=2; i<=k/2; i++){
    //         if(k % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }