class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] arr2 = new int[arr.length];
        int index = 0;
        Map<Integer,int[]> d = new HashMap<>();
        for(int[] t:pieces){d.put(t[0],t);}
        for(int t:arr){
            if (d.containsKey(t)){
                int i=0;
                for(;i<d.get(t).length;i++){
                    arr2[index+i] = d.get(t)[i];}
                index += i;
            }
        }
        return Arrays.equals(arr,arr2);
    }
}
