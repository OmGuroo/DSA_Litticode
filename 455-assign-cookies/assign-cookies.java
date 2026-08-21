class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = g.length;
        int j = 0;
        if(n > s.length){
            n = s.length;
        }
        if(n < s.length){
            j = s.length - n;
        }
        int k = 0;
        int i = 0;
        while(i < n && j < s.length){
            if(g[i] <= s[j]){
                k++;
                i++;
                j++;
            } else {
                j++;
            }
        }    
        return k;
    }
}