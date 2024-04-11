class Solution {

    public int sumOfFlooredPairs(int[] arr) {
        int n = arr.length;
        long ans = 0;
        long mod = 1000000007;

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            max = Math.max(arr[i],max);
        }

        int freq[] = new int[max+1];

        for(int i=0; i<n; i++){
            freq[arr[i]]++;
        }

        int pre[] = new int[max+1];

        for(int i=1; i<=max; i++){
            pre[i] = pre[i-1]+freq[i];
        }

        for(int i=1; i<=max; i++){
            
            if(freq[i]==0) continue;

            long sum = 0;
            for(int j=1; j*i<=max; j++){
                int left = j*i;
                int right = i*(j+1)-1;
                right = Math.min(right,max);
                int count = pre[right]-pre[left-1];
                sum = (sum+(j*count)%mod)%mod;
            }
            ans = (ans + (long)(freq[i]*sum)%mod)%mod;
        }
        return (int)(ans%mod);
    }
}
