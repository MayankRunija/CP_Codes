class Solution {
    public int findLHS(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(int i:nums){
            if(map.containsKey(i+1)){
                int freq=map.get(i)+map.get(i+1);
                ans=Math.max(ans,freq);
            }
        }
        return ans;
    }
}
