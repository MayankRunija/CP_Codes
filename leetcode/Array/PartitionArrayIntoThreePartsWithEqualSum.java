class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i : arr)
            sum = sum + i;
        if(sum%3 != 0)
            return false;

        int avg = sum/3;
        int tempSum = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            tempSum = tempSum + arr[i];
            if(tempSum == avg){
                tempSum = 0;
                count++;
            }
        }
        if(count >= 3) 
            return true;

        return false;
    }
}
