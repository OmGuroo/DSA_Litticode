class Solution {
    public boolean checkDivisibility(int n) {
        int c = n;
        int p = 1;
        int s = 0;
        while(n > 0){
            int ld = n % 10;
            s += ld;
            p *= ld;
            n /= 10;
        }  
        return (c % (p + s)) == 0; 
    }
}