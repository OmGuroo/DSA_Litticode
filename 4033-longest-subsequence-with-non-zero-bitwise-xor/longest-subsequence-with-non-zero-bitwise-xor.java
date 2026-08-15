class Solution {
    public int longestSubsequence(int[] nums) {
        int c = 0;
        int x = 0;
        int n = nums.length;
        for(int i : nums){
            x ^= i;
            if(i != 0){
                c++;
            }
        }    
        if(x != 0){
            return n;
        }
        if(c != 0){
            return n-1;
        }
        return 0;
    }
}