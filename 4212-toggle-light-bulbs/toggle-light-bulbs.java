class Solution {

    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int[] a = new int[101];
        for(int i : bulbs){
            a[i]++;
        }
        List<Integer> al = new ArrayList<>();
        for(int i=1; i<101; i++){
            if(a[i] % 2 != 0){
                al.add(i);
            }
        }
        return al;
    }

    // public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
    //     Set<Integer> hs = new HashSet<>();
    //     List<Integer> ar = new ArrayList<>();
    //     for (int i : bulbs) {
    //         if (hs.contains(i)) {
    //             hs.remove(i);
    //             ar.remove(Integer.valueOf(i));
    //         } else {
    //             hs.add(i);
    //             ar.add(i);
    //         }
    //     }
    //     Collections.sort(ar);
    //     return ar;
    // }
}