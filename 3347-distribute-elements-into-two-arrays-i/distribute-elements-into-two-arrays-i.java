class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> aj = new ArrayList<>();
        int x = nums[0];
        int y = nums[1];
        ar.add(x);
        aj.add(y);
        for(int i = 2; i < nums.length; i++){
            if(x > y){
                ar.add(nums[i]);
                x = nums[i];
            } else {
                aj.add(nums[i]);
                y = nums[i];
            }
        }
        int p = 0;
        for(int i : ar){
            nums[p++] = i;
        }
        for(int j : aj){
            nums[p++] = j;
        }
        return nums;
    }
}