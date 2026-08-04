class Solution {
    public int minimumPushes(String word) {
        int[] a = new int[26];
        for(int j = 0; j < word.length(); j++){
            int i = word.charAt(j) - 'a';
            a[i]++;
        }    
        Arrays.sort(a);
        int j = 25;
        int e = 8;
        int ts = 0;
        while(j >= 0 && a[j] > 0){
            ts += (a[j] * (e / 8));
            e++;
            j--;
        }
        return ts;
    }
}