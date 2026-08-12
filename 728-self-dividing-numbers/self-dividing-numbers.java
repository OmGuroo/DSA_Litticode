class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al = new ArrayList<>();
        while(left <= right){
            int k = left;
            int b = 1;
            while(k != 0){
                int ld = k % 10;
                k /= 10;
                if(ld == 0){
                    b = 0;
                    break;
                }
                if((left % ld) != 0){
                    b = 0;
                    break;
                }
            }
            if(b == 1){
                al.add(left);
            }
            left++;
        }
        return al;
    }
}