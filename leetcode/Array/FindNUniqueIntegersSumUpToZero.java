class Solution {
    public int[] sumZero(int n) {
        int a[]=new int[n];
        int c=1;
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            sum+=c;
            a[i]=c;
            c++;
        }
        a[n-1]=-1*sum;
        return a;   
    }
}
