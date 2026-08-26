class Solution {
    public boolean judgeSquareSum(int c) {
        int x = 0;
        int y = c;
        while(x <= y){
            if(ps(x) && ps(y)){
                return true;
            }
            if(!ps(x)){
                int k =(int) Math.sqrt(x) + 1;
                x = k*k;
                y = c - x;
            } else {
                int g =(int) Math.sqrt(y);
                y = g*g;
                x = c - y;
            }
        }
        return false;
    }
    public boolean ps(int n){
        int x =(int) Math.sqrt(n);
        return n == (x*x);
    }
}