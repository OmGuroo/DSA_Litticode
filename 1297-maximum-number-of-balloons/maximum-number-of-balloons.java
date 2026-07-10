class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] a = new int[26];
        for(int i=0; i<text.length(); i++){
            char c = text.charAt(i);
            a[c - 'a']++;
        }                
        int mini = 10000;
        mini = Math.min(a[1], mini);
        mini = Math.min(a[0], mini);
        mini = Math.min((a[11]/2), mini);
        mini = Math.min((a[14]/2), mini);
        return Math.min((a[13]), mini);
    }
}