class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        int max=100000000;
        int count=0;
        for(int i=0;i<fronts.length;i++){
            if(fronts[i]==backs[i]){
                ans.put(fronts[i],1);
            }
        }
        for(int i=0;i<fronts.length;i++){
            if(ans.containsKey(fronts[i])&& ans.containsKey(backs[i])){
                continue;
            }
            if(ans.containsKey(fronts[i])){
                max=(int)Math.min(max,backs[i]);
                count=1;
            }
            else if(ans.containsKey(backs[i])){
                max=(int)Math.min(max,fronts[i]);
                count=1;
            }
            else{
                max=(int)Math.min(max,(int)Math.min(fronts[i],backs[i]));
                count=1;
            }
        }
        if(count!=1){
            return 0;
        }
        return max;
    }
}
