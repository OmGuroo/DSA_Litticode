class Solution {
    public int numberOfSubstrings(String s) {
        int[] ar = new int[26];
        int n = s.length();
        int l = 0;
        int r = 0;
        int t = 0;
        while(r < n){
            ar[s.charAt(r) - 'a']++;
            while(ar[0] != 0 && ar[1] != 0 && ar[2] != 0){
                t += n - r;
                ar[s.charAt(l) - 'a']--;
                l++;
            }
            r++;
        }
        return t;
    }
}