class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map1 = new TreeMap<>();
        for(int i: nums)
            map1.put(i,map1.getOrDefault(i,0)+1);
        Map<Integer,List<Integer>> map2 = new TreeMap<>();
        for(Map.Entry m: map1.entrySet()){
            int num = (int)m.getKey();
            int fre = (int)m.getValue();
            if(map2.containsKey(fre)){
                List<Integer> l = new ArrayList<>(map2.get(fre));
                l.add(num);
                map2.replace(fre,l);
            }
            else{
                List<Integer> l = new ArrayList<>();
                l.add(num);
                map2.put(fre,l);
            }
        }
        int arr[] = new int[nums.length];
        int index=0;
        for(Map.Entry m: map2.entrySet()){
            int fre = (int)m.getKey();
            List<Integer> l = new ArrayList<>(map2.get(fre));
            Collections.sort(l);
            for(int i=l.size()-1;i>=0;i--){
                for(int k=0;k<fre;k++){
                    arr[index]=l.get(i);
                    index++;
                }
            }
        }
        return arr;
    }
}
