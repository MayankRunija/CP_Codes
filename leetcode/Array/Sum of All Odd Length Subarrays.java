class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            int leftBr = i+1;
            int rightBr = arr.length - i;
            int totalSub = leftBr*rightBr;
            int oddSub = (totalSub%2==0?0:1) + totalSub/2;
            sum+= arr[i]*oddSub;
        }
        return sum;
    }
}
