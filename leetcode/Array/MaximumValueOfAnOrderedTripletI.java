class Solution {
    public long maximumTripletValue(int[] arr) {
        long max=0;
        int n=arr.length;
        if(n==3){
            max=Math.max(max,(long)(arr[0]-arr[1])*(long)arr[2]);
        }
        else{
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    max=Math.max(max,(long)(arr[i]-arr[j])*(long)arr[k]);
                }
            }
        }
        }
        if(max<0)return 0;
        
        return max;
    }
}
