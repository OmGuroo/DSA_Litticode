class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int mini= 100001;
        int g = -1;
        int maxi= Integer.MIN_VALUE;
        int s = -1;
        for(int i = 0; i < n; i++){
            if(nums[i] < mini){
                mini = nums[i];
                g = i;
            }
            if(nums[i] > maxi){
                maxi = nums[i];
                s = i; 
            }
        }    
        int t = n - Math.min(g, s);
        int k = Math.min(g, s) + 1 + n - Math.max(g, s);
        t = Math.min(t, k);
        return Math.min(Math.max(g+1,s+1), t);
    }
}