class Solution {
    public int smallestNumber(int n) {
        StringBuilder sb = new StringBuilder();
        int ts = 1;
        while(n != 0){
            ts *= 2;
            n >>= 1;
        }
        return ts - 1;
    }
}