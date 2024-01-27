class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        func (arr, new ArrayList<>(), nums);
        return arr;
    }
    void func (List<List<Integer>> arr, List<Integer> pro, int[] unpro) {
        if (unpro.length==0) {
            arr.add(new ArrayList<>(pro));
            return;
        }
        pro.add(unpro[0]);
        func (arr, pro, Arrays.copyOfRange(unpro, 1, unpro.length));
        pro.remove(pro.size()-1);
        func (arr, pro, Arrays.copyOfRange(unpro, 1, unpro.length));
    }
}
