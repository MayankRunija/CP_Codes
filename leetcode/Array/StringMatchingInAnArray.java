class Solution {
    public List<String> stringMatching(String[] arr) {
        List<String> l=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j&&arr[j].contains(arr[i])){
                    l.add(arr[i]);
                    break;
                }
            }
        }

        return l;
    }
}
