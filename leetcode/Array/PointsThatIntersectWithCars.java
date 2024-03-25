class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> set = new HashSet<>();
        for(List<Integer> list:nums){
            for(int i=list.get(0);i<=list.get(1);i++){
                set.add(i);
            }
        }
        return set.size();
    }
}
