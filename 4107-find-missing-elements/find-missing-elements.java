class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int mini = 101;
        int maxi = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
            if(i < mini){
                mini = i;
            } 
            if(i > maxi){
                maxi = i;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(++mini < maxi){
            if(!hs.contains(mini)){
                ans.add(mini);
            }
        }
        return ans;
    }
}