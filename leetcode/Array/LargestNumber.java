class Solution {
    void merge(int[] a,int low,int mid,int high){
        int temp[]=new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){

            long n= 10,m=10;
            while(a[i] >= n)  n *= 10;
            while(a[j] >= m)  m *= 10;
            
            long l=a[i]*m+a[j];
            long h=a[j]*n+a[i];
            if(l>h)temp[k++]=a[i++];
            else temp[k++]=a[j++];
        }
        while(i<=mid)temp[k++]=a[i++];
        while(j<=high)temp[k++]=a[j++];
        k=0;
        i=low;
        while(i<=high){
            a[i++]=temp[k++];
        }
    }
    void divide(int[] nums,int st,int end){
        if(st==end)return ;
        int mid=st+(end-st)/2;
        divide(nums,st,mid);
        divide(nums,mid+1,end);
        merge(nums,st,mid,end);
    }
    public String largestNumber(int[] nums) {
        divide(nums,0,nums.length-1);
        StringBuilder ans= new StringBuilder();
        for(int i:nums){
            ans.append(Integer.toString(i));
        }
        return nums[0]==0?"0":ans.toString();
    }
}
