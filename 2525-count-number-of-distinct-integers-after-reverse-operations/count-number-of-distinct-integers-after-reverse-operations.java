class Solution {
    public int countDistinctIntegers(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<n; i++){
            hs.add(nums[i]);
            int r = 0;
            while(nums[i] != 0){
                r = (r * 10) + nums[i]%10;
                nums[i] /= 10; 
            }
            hs.add(r);
        }
        return hs.size();
    }
}