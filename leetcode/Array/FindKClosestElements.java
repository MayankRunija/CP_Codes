class Solution {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		int start=0;
		long sum=0;
		long min=(long)1e9;
		int ai=-1,aj=-1;
		for(int i=0;i<arr.length;i++){
			sum+=Math.abs(arr[i]-x);
			while(i-start+1>k){
				sum-=Math.abs(arr[start++]-x);
			}
			if(i-start+1==k && sum<min){
				min=sum;
				ai=start;
				aj=i;
			}
		}
		List<Integer> list= new ArrayList<>();
		for(int i=ai;i<=aj;i++){
			list.add(arr[i]);
		}

		return list;
	}
}
