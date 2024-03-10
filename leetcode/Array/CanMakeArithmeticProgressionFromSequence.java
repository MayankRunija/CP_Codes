class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        boolean temp=true;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==diff){
                continue;
            }else{
                temp=false;
            }
        }
        if(temp==true){
            return true;
        }else{
            return false;
        }
    }
}
