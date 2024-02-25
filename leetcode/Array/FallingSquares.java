class Solution {
        int max = Integer.MIN_VALUE;
		
    public List<Integer> fallingSquares(int[][] p) {
        List<int[]> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int[] s : p) {
            int[] node = new int[]{s[0], s[0] + s[1], s[1]};
            ans.add(getMax(list, node));
        }
        return ans;
    }
    
    private int getMax(List<int[]> list, int[] node) {
        int height = 0;
        for (int[] e : list) {
            if(e[0] >= node[1] || e[1] <= node[0]) continue;
            height = Math.max(height, e[2]);
        }
        node[2] += height;
        list.add(node);
        max = Math.max(max, node[2]);
        return max;
    }  
    
}
