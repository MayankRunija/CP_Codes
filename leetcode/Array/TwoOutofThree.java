class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int temp1[]=new int[101] , temp2[]=new int[101] , temp3[]=new int[101];
        int max=Math.max(nums1.length,nums2.length);  int tMax=Math.max(max,nums3.length);
        int count1=0,count2=0,count3=0;

        for(int i=0;i<tMax;i++){
            if(count1<nums1.length){
                temp1[nums1[i]]++;  count1++;
            }
            if(count2<nums2.length){
                temp2[nums2[i]]++; count2++;
            }
            if(count3<nums3.length){
                temp3[nums3[i]]++; count3++;
            }
        }
        
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<101;i++){
            if(temp1[i]>0 && temp2[i]>0 && temp3[i]>0 || temp1[i]>0 && temp2[i]>0 || temp2[i]>0 && temp3[i]>0 || temp1[i]>0 && temp3[i]>0 ){
                list.add(i);
            }
        }
        return list;
    }
}
