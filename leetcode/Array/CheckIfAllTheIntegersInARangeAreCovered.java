class Solution {
    public boolean isCovered(int[][] arr, int left, int right) {
        int n = arr.length;

        for(int i=left; i<=right; i++){
            boolean flag = false;
            for(int j=0; j<n; j++){
                if(i>=arr[j][0] && i<=arr[j][1]){
                    flag = true;
                    break;
                }
            }
            if(flag==false) return false;
        }
        return true;
    }
}
