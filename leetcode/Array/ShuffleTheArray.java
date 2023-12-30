class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[]= new int [2*n];
        int j=0;
        int i=n;
        for(int k=0; i<2*n; k++){
            res[k]=nums[j];
            k++;
            res[k]=nums[i];
            j++;
            i++;
        }
        return res;
        
        
    }
}
