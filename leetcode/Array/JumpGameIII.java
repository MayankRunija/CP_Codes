class Solution {
    public static boolean finder(int arr[],int index,ArrayList<Integer> lst,Boolean dp[]){
        
        if(index<0 || index>=arr.length || lst.contains(index)){
            return false;
        }
        if(dp[index]!=null){
            return dp[index];
        }
        if(arr[index]==0){
            return dp[index]=true;
        }
        
        lst.add(index);
        boolean pick=finder(arr,index+arr[index],lst,dp);
        boolean npick=finder(arr,index-arr[index],lst,dp);
        lst.remove(lst.size()-1);
        return dp[index]=pick||npick;
    }
    public boolean canReach(int[] arr, int start) {
        if(arr[arr.length-1]==0)
        return true;
        Boolean dp[]=new Boolean[arr.length];
        return finder(arr,start,new ArrayList<>(),dp);
    }
}
