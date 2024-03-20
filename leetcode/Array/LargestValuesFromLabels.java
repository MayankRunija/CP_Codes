class Solution {

    class Pair{
        int num;
        int label;
        Pair(int num, int label){
            this.num = num;
            this.label = label;
        }
    }

    public int largestValsFromLabels(int[] val, int[] lab, int numWanted, int useLimit) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        ArrayList<Pair> arr = new ArrayList<>();

        for(int i=0; i<lab.length; i++){
            arr.add(new Pair(val[i],lab[i]));
        }

        Collections.sort(arr,(a,b)->(b.num-a.num));
        int ans = 0;
        for(int i=0; i<arr.size(); i++){
            Pair p = arr.get(i);
            int num = p.num;
            int label = p.label;

            if(numWanted>0){
                if(!hp.containsKey(label)){
                    ans = ans+num;
                    hp.put(label,1);
                    numWanted--;
                }else{
                    if(hp.get(label)<useLimit){
                        ans = ans + num;
                        hp.put(label,hp.get(label)+1);
                        numWanted--;
                    }
                }
            }
        }
        return ans;
    }
}
