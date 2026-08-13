class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int x = 1;
        for(int i=1; i<n; i++){
            if(nums[i] == nums[i - 1]){
                x++;
            } else {
                if(x > (n / 3)){
                    al.add(nums[i-1]);
                }
                x = 1;
            }
        }

        if(x > (n / 3)){
            al.add(nums[n-1]);
        }
        return al;
    }
}