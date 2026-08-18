class Solution {
    public int largestInteger(int[] nums, int k) {
        int maxi = 0;
        int uniq = -1;
        int[] a = new int[51];
        int n = nums.length;
        for(int i : nums){
            if(i > maxi){
                maxi = i;
            }
            a[i]++;
        }

        if(k == n){
            return maxi;
        }
        for(int i = 50; i >= 0; i--){
            if(a[i] == 1){
                uniq = i;
                break;
            }
        }
        if(k == 1){
            return uniq;
        }

        int sm = nums[0];
        int gr = nums[n-1];

        if(sm > gr){
            int te = gr;
            gr = sm;
            sm = te;
        }
        if(a[gr] == 1){
            return gr;
        }
        if(a[sm] == 1){
            return sm;
        }
        return -1;
    }    
}







    //     HashSet<Integer> hs = new HashSet<>();
    //     int n = nums.length;
    //     for(int i=0; i<=n-k; i++){
    //         for(int j=i; j<i+k; j++){
    //             if(!hs.contains(nums[j])){
    //                 hs.add(nums[j]);
    //             } else {
    //                 hs.remove(nums[j]);
    //             }
    //         }
    //     }
    //     int maxi = 0;
    //     for(int i : hs){
    //         if(i > maxi){
    //             maxi = i;
    //         }
    //     }
    //     return maxi;
    //  }


        // int[] a = new int[51];
        // int maxi = 0;
        // int n = nums.length;
        // for(int i : nums){
        //     a[i]++;
        //     if(i > maxi){
        //         maxi = i;
        //     }
        // }    
        // int ans = Math.max(nums[0], nums[n - 1]);
        // int sma = Math.min(nums[0], nums[n - 1]);
        // if(a[ans] == 1){
        //     return ans;
        // }
        // if(a[sma] == 1){
        //     return sma;
        // }
        // if(n == k){
        //     return maxi;
        // }
        // return -1; 