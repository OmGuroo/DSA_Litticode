class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid[0].length;
        int[] a = new int[n+1];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                a[grid[i][j]]++;
            }
        }    
        int[] t = new int[2];
        for(int i=1; i<n+1; i++){
            if(a[i] == 2) t[0] = i;
            else if(a[i] == 0) t[1] = i;
        }
        return t;
    }
}