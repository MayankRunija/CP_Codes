class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        ms(nums,0,nums.length-1);
        int[] pref=new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            ans[i]=find(queries[i],pref);
        }
        return ans;
    }
    public int find(int target,int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target) return mid+1;
            else if(arr[mid]>target) e=mid-1;
            else s=mid+1;
        }
        return s;
    }
    public void ms(int[] arr,int s,int e){
        if(arr[s]==arr[e]) return;
        int mid=s+(e-s)/2;
        ms(arr,s,mid);
        ms(arr,mid+1,e);
        merge(arr,s,mid,e);
    }
    public void merge(int[] arr,int s,int mid,int e){
        int left=s;
        int right=mid+1;
        int ans[]=new int[e-s+1];
        int idx=0;
        while(left<=mid && right<=e){
            if(arr[left]<=arr[right]){
                ans[idx]=arr[left];
                left++;
            }else{
                ans[idx]=arr[right];
                right++;
            }
            idx++;
        }
        while(left<=mid){
            ans[idx]=arr[left];
            left++;
            idx++;
        }
        while(right<=e){
            ans[idx]=arr[right];
            right++;
            idx++;
        }
        for(int i=s;i<=e;i++){
            arr[i]=ans[i-s];
        }
    }
}
