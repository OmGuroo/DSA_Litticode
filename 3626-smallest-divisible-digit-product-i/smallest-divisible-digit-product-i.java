class Solution {
    public int smallestNumber(int n, int t) {
        while(n <= 100){
            int c = n;
            int p = 1;
            while(c != 0){
                p = p*(c % 10);
                c /= 10;
            }
            if(p % t == 0){
                return n;
            } else {
                n++;
            }
        }
        return n;
    }
}