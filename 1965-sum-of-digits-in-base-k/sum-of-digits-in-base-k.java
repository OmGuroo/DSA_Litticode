class Solution {
    public int sumBase(int n, int k) {
        String s = Integer.toString(n, k);
        int ts = 0;
        for(int i = 0; i < s.length(); i++){
            int g = s.charAt(i) - '0';
            ts += g;
        }    
        return ts;
    }
}