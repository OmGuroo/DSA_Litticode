class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        int tc = 0;
        for(int i : s){
            if(i >= g[j]){
                j++;
                tc++;
            }
            if(j == g.length){
                return tc;
            }
        }
        return tc;
    }
}