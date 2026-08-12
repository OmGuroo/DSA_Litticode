class Solution {
    public int minMoves2(int[] nums) {
        int ts = 0;
        int n = nums.length;
        Arrays.sort(nums);
        int j = nums[n/2];
        for(int i : nums){
            ts += (Math.abs(i - j));
        }

        return ts;
    }
}