class Solution {
    public int rectangleArea(int[][] A) {
        int ans = 0, L = 1, R = -1, px = 0, M = (int)1e9+7;
        TreeMap<Integer, List<int[]>> map = new TreeMap<>(); // xmap: x value to a list of items to be updated
        TreeMap<Integer, Integer> ymap = new TreeMap<>(); // ymap: y value to rectangle counts
        for (int i = 0; i < A.length; i++){
            map.computeIfAbsent(A[i][0], o -> new ArrayList<>()).add(new int[]{i, L});
            map.computeIfAbsent(A[i][2], o -> new ArrayList<>()).add(new int[]{i, R});
        }
        for (int x : map.keySet()){
            int py = 0, cnt = 0, sum = 0;
            for (int y : ymap.keySet()){ // sum all y that is covered by a rect
                if (cnt > 0){ // there is at least 1 rect, so add it to sum.
                    sum += y - py;
                }
                py = y;
                cnt += ymap.get(y);
            }
            ans += 1L * (x - px) * sum % M;
            ans %= M;
            px = x;
            for (int[] m : map.get(x)){ // update y values 
                ymap.merge(A[m[0]][1],  1*m[1], Integer::sum); // we can remove this key if count = 0 after update (x2 faster)
                ymap.merge(A[m[0]][3], -1*m[1], Integer::sum); // we can remove this key if count = 0 after update (x2 faster)
            }
        }
        return ans;
    }
}
