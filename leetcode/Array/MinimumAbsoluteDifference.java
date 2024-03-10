class Solution {
public List<List> minimumAbsDifference(int[] arr) {

Arrays.sort(arr);
List<List> l2 = new ArrayList<List>();
int absDiff = Integer.MAX_VALUE;
for(int i=0;i<arr.length-1;i++){
int curr = arr[i+1] - arr[i];
if(curr < absDiff){
l2.clear();
List l1 = Arrays.asList(arr[i],arr[i+1]);
l2.add(l1);
absDiff = curr;
}else if( curr == absDiff){
List l1 = Arrays.asList(arr[i],arr[i+1]);
l2.add(l1);
}

}
return l2;
}
}
